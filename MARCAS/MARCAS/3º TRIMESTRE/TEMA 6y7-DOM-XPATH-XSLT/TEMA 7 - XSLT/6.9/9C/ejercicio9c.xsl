<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="html" encoding="UTF-8" indent="yes"/>
<xsl:template match="/ies">
<html>
    <head>
        <title>Estadísticas del IES</title>
        <link rel="stylesheet" href="estilos_ejer9.css"/>
    </head>
    <body>
        <h1 class="header"><xsl:value-of select="instituto"/></h1>

        <main>
            <div class="estad">
                <h2>Estadísticas</h2>
                <ul>
                    <xsl:variable name="totalAlumnos" select="count(alumnos/alumno)"/>
                    <xsl:variable name="sumaEdades" select="sum(alumnos/alumno/edad)"/>
                    <xsl:variable name="edadMedia" select="$sumaEdades div $totalAlumnos"/>
                    <xsl:variable name="alumnos18_25" select="count(alumnos/alumno[edad &gt;= 18 and edad &lt;= 25])"/>
                    <xsl:variable name="alumnos26_35" select="count(alumnos/alumno[edad &gt;= 26 and edad &lt;= 35])"/>
                    <xsl:variable name="alumnosMas35" select="count(alumnos/alumno[edad &gt; 35])"/>

                    <li><span>Número total alumnos/as:</span> <span class="stats"><xsl:value-of select="$totalAlumnos"/></span></li>
                    <li><span>Edad media:</span> <span class="stats"><xsl:value-of select="format-number($edadMedia, '#.##')"/></span></li>
                    <li><span>alumnado de 18 a 25 años:</span> <span class="stats"><xsl:value-of select="$alumnos18_25"/> (<xsl:value-of select="format-number($alumnos18_25 div $totalAlumnos * 100, '##')"/>%)</span></li>
                    <li><span>alumnado de 26 a 35 años:</span> <span class="stats"><xsl:value-of select="$alumnos26_35"/> (<xsl:value-of select="format-number($alumnos26_35 div $totalAlumnos * 100, '##')"/>%)</span></li>
                    <li><span>alumnado de más de 35 años:</span> <span class="stats"><xsl:value-of select="$alumnosMas35"/> (<xsl:value-of select="format-number($alumnosMas35 div $totalAlumnos * 100, '##')"/>%)</span></li>
                </ul>
            </div>
        </main>
    </body>
</html>
</xsl:template>
</xsl:stylesheet>