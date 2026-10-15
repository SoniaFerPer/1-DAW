<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="html" doctype-system="about:legacy-compat" encoding="UTF-8" indent="yes"/>
<xsl:template match="/ies">
<html>
    <head>
        <title>Alumnado con más horas de clase</title>
        <link rel="stylesheet" href="estilos_ejer9.css"/>
    </head>
    <body>
        <h1 class="header"><xsl:value-of select="instituto"/></h1>

        <main>
            <h2>Alumnado con más horas de clase</h2>
            <table class="alumnado-t ancho">
                    <tr>
                        <th>Posición</th>
                        <th>Alumno/a</th>
                        <th>Nº módulos</th>
                    </tr>
                    <xsl:for-each select="alumnos/alumno">
                        <xsl:sort select="count(estudios/modulos/modulo)" order="descending"/>
                        <xsl:sort select="apellido1"/>
                        <tr>
                            <td><xsl:value-of select="position()"/></td>
                            <td><xsl:value-of select="concat(apellido1, ' ', apellido2, ', ', nombre)"/></td>
                            <td><xsl:value-of select="count(estudios/modulos/modulo)"/></td>
                        </tr>
                    </xsl:for-each>
            </table>
        </main>
    </body>
</html>
</xsl:template>
</xsl:stylesheet>