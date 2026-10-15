<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

   
    <xsl:template match="/inventario">
        <html>
            <head>
                <title>ejercicio7c.xsl</title>
            </head>
            <body>
                <table border="1">
                    <h1>Resultados</h1>
                   <xsl:for-each select="producto">
                       <tr>
                            <td><xsl:value-of select="nombre"/></td>
                            <td><xsl:value-of select="peso"/></td>
                            <td><xsl:value-of select="lugar/@edificio"/><xsl:value-of select="lugar/aula"/></td>
                       </tr>
                    </xsl:for-each> 
                </table>
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>
