<?xml version="1.0" encoding="UTF-8"?>


<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>
    <xsl:template match="/ies">
        <html>
            <head>
                <title>UD6 ejercicio5d</title>
            </head>
            <body>
                <table border="1">
                    <th>
                        <xsl:text>Nombre ciclo</xsl:text>
                    </th>
                    <xsl:for-each select="//ciclos/ciclo">
                        <tr>
                            <td><xsl:value-of select="./nombre/text()"/></td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
