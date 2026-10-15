<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>
    <xsl:template match="/ies">
        <html>
            <head>
                <title>UD6 ejercicio6b</title>
            </head>
            <body>
                <h1><xsl:value-of select="./nombre/text()"/></h1>
                <p>
                    <xsl:text>Pagina web: </xsl:text>
                    <a href="{web}">
                        <xsl:value-of select="./web/text()"/>
                    </a>
                </p>
                <xsl:for-each select=".//ciclo/nombre">
                    <li>
                        <xsl:value-of select="./text()"/>
                    </li>
                </xsl:for-each>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
