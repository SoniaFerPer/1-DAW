<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html" encoding="UTF-8" indent="yes"/>
    <xsl:template match="/ies">
        <html>
            <head>
                <title>UD6 ejercicio6c</title>
            </head>
            <body>
                <h1> 
                    <xsl:value-of select="./nombre/text()"/>
                </h1>
                <p>
                    <xsl:text>Pagina web: </xsl:text>
                    <a href="{web}">
                        <xsl:value-of select="./web/text()"/>
                    </a>
                </p>
                <table border="1">
                    <tr>
                        <th><xsl:text>Nombre del ciclo</xsl:text></th>
                        <th><xsl:text>Grado</xsl:text></th>
                        <th><xsl:text>Año del titulo</xsl:text></th>
                    </tr>
                <xsl:for-each select=".//ciclos/ciclo">
                    <tr>
                        <td><xsl:value-of select="nombre/text()"/></td>
                        <td><xsl:value-of select="grado/text()"/></td>
                        <td><xsl:value-of select="decretoTitulo/@anyo"/></td>                        
                    </tr>
                </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>