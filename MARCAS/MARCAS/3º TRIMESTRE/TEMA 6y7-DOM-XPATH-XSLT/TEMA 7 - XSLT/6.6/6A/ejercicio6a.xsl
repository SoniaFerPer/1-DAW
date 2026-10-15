<?xml version="1.0" encoding="UTF-8"?>


<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>
    <xsl:template match="/ies">
        <html>
            <head>
                <title>UD6 ejercicio6a</title>
            </head>
            <body>
                <h1>
                    <xsl:text>IES Oretania</xsl:text>
                </h1>
                <xsl:for-each select="//ciclo/nombre">
                <p><xsl:value-of select="./text()"/></p>
                </xsl:for-each>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>