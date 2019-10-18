<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<xsl:template match="/">
<html>
  <head>
   <title>武汉天气情况</title>
   <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
   <link type="text/css" media="all" rel="stylesheet" href="weather.css"/>
  </head>
  <body>
  <div id="top">
   <div id="menu"> <!--顶部菜单-->
     <ul>
      <xsl:apply-templates select="//menu"/>
     </ul>
   </div>
   </div>
   <div id="banner"> <!--logo和banner-->
   	<div class="logo">
      <ul>
         <xsl:apply-templates select="//banner"/>
      </ul>
    </div>
   	<div class="search">
   		<xsl:apply-templates select="//bannerinput"/>
	</div>
  <div class="submit">
    <!-- <input type="submit" value-of="搜索"> -->
  </div>
   </div>
   <div id="main"><!--主体部分-->
     <div id="mainleft"><!--主体左侧-->
      <div class="navigation">
      <ul>
        <xsl:apply-templates select="//address"/>
      </ul>
      <div class="info">数据来源 中央气象台</div>
      <div class="flashTime">
        18:00更新
      </div>
     <div class="days">
       <ul>
         <xsl:apply-templates select="//day"/>
       </ul>
     </div>
    </div>
    <div class="information">
      <ul>
        <xsl:apply-templates select="//information"/>
      </ul>
    </div>
     </div>
     <div id="mainright">
      <div class="news">
        <ul>
         <xsl:apply-templates select="//news"/>
       </ul>
       </div>
       <div class="radio">
       </div>
       <div class="newslist">
         <ul>
            <xsl:apply-templates select="//newslist"/>
         </ul>
       </div>
     </div>
     </div>
   <div id="bottom"><!--底部版权部分-->
    
   </div>  
  </body>
</html>
</xsl:template>

<xsl:template match="//menu">
  <xsl:for-each select="child::topmenu">
  <li>
   <a target="_blank">
    <xsl:attribute name="topmenu">
     <xsl:value-of select="hyperlink"/>
    </xsl:attribute>    
    <xsl:value-of select="item"/>
   </a>
  </li>
</xsl:for-each>
</xsl:template>

<xsl:template match="//banner">
 <xsl:for-each select="child::logomenu">
  <a target="_blank">
    <xsl:attribute name="logomenu">
     <xsl:value-of select="hyperlink"/>
    </xsl:attribute>    
    <xsl:value-of select="item"/>
  </a>
  </xsl:for-each>
</xsl:template>

<xsl:template match="//bannerinput">
  <input>
    <xsl:attribute name="input">
    </xsl:attribute>  
  </input>
</xsl:template>

<xsl:template match="//bannerinput">
  <input>
    <xsl:attribute name="input">
    </xsl:attribute>  
  </input>
</xsl:template>


<xsl:template match="//address">
 <xsl:for-each select="child::navigation">
  <a target="_blank">
    <xsl:attribute name="Address">
     <xsl:value-of select="hyperlink"/>
    </xsl:attribute>    
    <xsl:value-of select="item"/>
  </a>
  </xsl:for-each>
</xsl:template>

<xsl:template match="//day">
 <xsl:for-each select="child::days">
  <a>
    <xsl:attribute name="Day">
     <xsl:value-of select="hyperlink"/>
    </xsl:attribute>    
    <xsl:value-of select="item"/>
  </a>
  </xsl:for-each>
</xsl:template>

<xsl:template match="//news">
 <xsl:for-each select="child::forcast">
  <a>
    <xsl:attribute name="new">
     <xsl:value-of select="hyperlink"/>
    </xsl:attribute>    
    <xsl:value-of select="item"/>
  </a>
  </xsl:for-each>
</xsl:template>

<xsl:template match="//newslist">
 <xsl:for-each select="child::list">
  <a>
    <xsl:attribute name="list">
     <xsl:value-of select="hyperlink"/>
    </xsl:attribute>    
    <xsl:value-of select="item"/>
  </a>
  </xsl:for-each>
</xsl:template>
<xsl:template match="//information">
 <xsl:for-each select="child::info">
  <p>
    <xsl:attribute name="infolist">
    </xsl:attribute>    
    <xsl:value-of select="item"/>
  </p>
  </xsl:for-each>
</xsl:template>
</xsl:stylesheet>
