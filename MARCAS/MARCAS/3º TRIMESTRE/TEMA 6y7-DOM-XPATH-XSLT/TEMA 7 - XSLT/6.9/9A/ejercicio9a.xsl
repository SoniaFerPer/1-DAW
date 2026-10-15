<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="html" doctype-system="about:legacy-compat" encoding="UTF-8" indent="yes"/>
<xsl:template match="/ies">
<html>
<head>
    <title>Listado de Alumnado</title>
    <link rel="stylesheet" href="estilos_ejer9.css"/>
</head>
<body>
    <h1 class="header"><xsl:value-of select="instituto"/></h1>

    <main>
        <h2>Listado de Alumnado</h2>
        <ol class="alumnado">
            <xsl:for-each select="alumnos/alumno">
                <xsl:sort select="apellido1"/>
                <xsl:sort select="apellido2"/>
                <li>
                    <xsl:value-of select="concat(apellido1, ' ', apellido2, ', ', nombre)"/>.
                    (<xsl:value-of select="@id"/>) - 
                    <xsl:value-of select="count(estudios/modulos/modulo)"/> módulos
                </li>
            </xsl:for-each>
        </ol>
    </main>
</body>
</html>
</xsl:template>
</xsl:stylesheet>