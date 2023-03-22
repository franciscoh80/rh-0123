<?xml version="1.0" encoding="UTF-8"?><xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<xsl:output doctype-system="about:legacy-compat" encoding="utf-8" omit-xml-declaration="yes" method="html"/><xsl:template match="/"><html><head><xsl:call-template name="IGRP-head"/><link href="{$path}/core/igrp/toolsbar/toolsbar.css?v={$version}" type="text/css" rel="stylesheet"/></head><body class="{$bodyClass} sidebar-off"><xsl:call-template name="IGRP-topmenu"/><form enctype="multipart/form-data" name="formular_default" class="IGRP-form" method="POST"><div class="container-fluid"><div class="row"><xsl:call-template name="IGRP-sidebar"/><div id="igrp-contents" class="col-sm-9 col-md-10 col-md-offset-2 col-sm-offset-3 main"><div class="content"><div class="row row-msg"><div class="gen-column col-md-12"><div class="gen-inner"><xsl:apply-templates select="rows/content/messages" mode="igrp-messages"/></div></div></div><div class="row"><div class="gen-column col-md-12"><div class="gen-inner"><xsl:if test="rows/content/toolsbar_1"><div class="gen-container-item" item-name="toolsbar_1"><div gen-fields=".btns-holder&gt;a.btn" gen-structure="toolsbar" class="toolsbar-holder default"><div role="group" class="btns-holder pull-right"><xsl:apply-templates mode="gen-buttons" select="rows/content/toolsbar_1"><xsl:with-param select="'true'" name="vertical"/><xsl:with-param select="'false'" name="outline"/></xsl:apply-templates></div></div></div></xsl:if><xsl:if test="rows/content/form_1"><div class="gen-container-item" item-name="form_1"><div class="box igrp-forms"><xsl:call-template name="box-header"><xsl:with-param select="rows/content/form_1/@title" name="title"/></xsl:call-template><div class="box-body"><div gen-id="drop-zone" role="form"><xsl:apply-templates select="rows/content/form_1/fields" mode="form-hidden-fields"/><xsl:if test="rows/content/form_1/fields/region_name"><div item-type="text" item-name="region_name" class="form-group col-sm-4" maxlength="25"><xsl:call-template name="setAttributes"><xsl:with-param select="rows/content/form_1/fields/region_name" name="field"/></xsl:call-template><label for="{rows/content/form_1/fields/region_name/@name}"><xsl:value-of select="rows/content/form_1/fields/region_name/label"/></label><input name="{rows/content/form_1/fields/region_name/@name}" id="{rows/content/form_1/fields/region_name/@name}" class="form-control " value="{rows/content/form_1/fields/region_name/value}" type="text" maxlength="25"><xsl:call-template name="setAttributes"><xsl:with-param select="rows/content/form_1/fields/region_name" name="field"/></xsl:call-template></input></div></xsl:if></div></div><xsl:apply-templates mode="form-buttons" select="rows/content/form_1/tools-bar"/></div></div></xsl:if></div></div></div></div></div></div></div><xsl:call-template name="IGRP-bottom"/></form><script src="{$path}/core/igrp/form/igrp.forms.js?v={$version}" type="text/javascript"/></body></html></xsl:template><xsl:include href="../../../xsl/tmpl/IGRP-functions.tmpl.xsl?v=1513184609983"/><xsl:include href="../../../xsl/tmpl/IGRP-variables.tmpl.xsl?v=1513184609983"/><xsl:include href="../../../xsl/tmpl/IGRP-home-include.tmpl.xsl?v=1513184609983"/><xsl:include href="../../../xsl/tmpl/IGRP-utils.tmpl.xsl?v=1513184609983"/><xsl:include href="../../../xsl/tmpl/IGRP-form-utils.tmpl.xsl?v=1513184616594"/></xsl:stylesheet>