<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="html" doctype-system="about:legacy-compat" encoding="UTF-8" indent="yes"/>
<xsl:template match="/ies">
<html>
<head>
    <title>Alumnado por grado de ciclo</title>
    <link rel="stylesheet" href="estilos_ejer9.css"/>
</head>
<body>
    <h1 class="header"><xsl:value-of select="instituto"/></h1>

    <main>
        <div class="estad">
            <h2>Estadísticas</h2>
            <table class="alumnado-t">
                    <tr>
                        <th>Grado del ciclo</th>
                        <th>Nº alumnado</th>
                    </tr>
                    <xsl:for-each select="ciclos/ciclo">
                        <xsl:variable name="grado" select="grado"/>
                        <xsl:variable name="codigo" select="@id"/>
                        <xsl:variable name="numAlumnos" select="count(/ies/alumnos/alumno[estudios/ciclo/@codigo = $codigo])"/>
                        
                        <xsl:if test="not(preceding-sibling::ciclo[grado = $grado])">
                            <tr>
                                <td>Ciclo de grado <xsl:value-of select="$grado"/></td>
                                <td>
                                    <xsl:value-of select="count(/ies/alumnos/alumno[estudios/ciclo/@codigo = /ies/ciclos/ciclo[grado = $grado]/@id])"/>
                                </td>
                            </tr>
                        </xsl:if>
                    </xsl:for-each>
            </table>
        </div>
    </main>
</body>
</html>
</xsl:template>
</xsl:stylesheet>