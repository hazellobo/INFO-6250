<?xml version="1.0" encoding="UTF-8"?>

<!--
    Document   : books.xsl
    Created on : October 14, 2022, 5:39 PM
    Author     : hazel
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:param name="doc"/> 
    <xsl:template match="/">
        <html>
            <head>
                <title>books.xsl</title>
            </head>
            <body>
                <h3>Book Details</h3>  
                <table border="2">  
                    <tr>  
                        <th align="left">Name</th>  
                        <th align="left">Author</th>  
                        <th align="left">Price</th>  
                    </tr>  

                    <xsl:for-each select="books/book">  
                        <tr>  
                            <td><xsl:value-of select="name"/></td>  
                            <td><xsl:value-of select="author"/></td>  
                            <td><xsl:value-of select="price"/></td>  
                        </tr>  
                    </xsl:for-each>  
                </table>  
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>