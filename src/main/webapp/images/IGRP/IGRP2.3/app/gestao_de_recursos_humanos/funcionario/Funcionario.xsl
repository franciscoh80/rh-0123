<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0"><xsl:output method="html" omit-xml-declaration="yes" encoding="utf-8" indent="yes" doctype-system="about:legacy-compat"/><xsl:template match="/"><html><head><xsl:call-template name="IGRP-head"/><link rel="stylesheet" type="text/css" href="{$path}/core/igrp/toolsbar/toolsbar.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/plugins/datepicker2/daterangepicker.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/plugins/datepicker2/IGRP.daterangepicker.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/plugins/select2/select2.min.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/plugins/select2/select2.style.css?v={$version}"/><style/></head><body class="{$bodyClass} sidebar-off"><xsl:call-template name="IGRP-topmenu"/><form method="POST" class="IGRP-form" name="formular_default" enctype="multipart/form-data"><div class="container-fluid"><div class="row"><xsl:call-template name="IGRP-sidebar"/><div class="col-sm-9 col-md-10 col-md-offset-2 col-sm-offset-3 main" id="igrp-contents"><div class="content"><div class="row row-msg"><div class="gen-column col-md-12"><div class="gen-inner"><xsl:apply-templates mode="igrp-messages" select="rows/content/messages"/></div></div></div><div class="row " id="row-b0c2872e"><div class="gen-column col-sm-2"><div class="gen-inner"/></div><div class="gen-column col-sm-8"><div class="gen-inner"><xsl:if test="rows/content/form_1"><div class="box igrp-forms gen-container-item " gen-class="" item-name="form_1"><xsl:call-template name="box-header"><xsl:with-param name="title" select="rows/content/form_1/@title"/><xsl:with-param name="collapsible" select="'false'"/><xsl:with-param name="collapsed" select="'false'"/></xsl:call-template><div class="box-body"><div role="form"><xsl:apply-templates mode="form-hidden-fields" select="rows/content/form_1/fields"/><xsl:if test="rows/content/form_1/fields/declaracao_de_vencimento"><div class="form-group col-sm-3  gen-fields-holder" item-name="declaracao_de_vencimento" item-type="link"><a href="{rows/content/form_1/fields/declaracao_de_vencimento/value}" class="link btn btn-link form-link" sharpadbclient="" target="_blank" request-fields=""><i class="fa fa-file-text-o"/><span><span><xsl:value-of select="rows/content/form_1/fields/declaracao_de_vencimento/label"/></span></span></a></div></xsl:if><xsl:if test="rows/content/form_1/fields/nome"><div class="form-group col-sm-12   gen-fields-holder" item-name="nome" item-type="text"><label for="{rows/content/form_1/fields/nome/@name}"><span><xsl:value-of select="rows/content/form_1/fields/nome/label"/></span></label><input type="text" value="{rows/content/form_1/fields/nome/value}" class="form-control  " inputmask="" id="{rows/content/form_1/fields/nome/@name}" name="{rows/content/form_1/fields/nome/@name}" disablehtml="true" maxlength="250" placeholder="{rows/content/form_1/fields/nome/@placeholder}"><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_1/fields/nome"/></xsl:call-template></input></div></xsl:if><xsl:if test="rows/content/form_1/fields/apelido"><div class="form-group col-sm-12   gen-fields-holder" item-name="apelido" item-type="text"><label for="{rows/content/form_1/fields/apelido/@name}"><span><xsl:value-of select="rows/content/form_1/fields/apelido/label"/></span></label><input type="text" value="{rows/content/form_1/fields/apelido/value}" class="form-control  " inputmask="" id="{rows/content/form_1/fields/apelido/@name}" name="{rows/content/form_1/fields/apelido/@name}" disablehtml="true" maxlength="250" placeholder="{rows/content/form_1/fields/apelido/@placeholder}"><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_1/fields/apelido"/></xsl:call-template></input></div></xsl:if><xsl:if test="rows/content/form_1/fields/email"><div class="form-group col-sm-12   gen-fields-holder" item-name="email" item-type="email"><label for="{rows/content/form_1/fields/email/@name}"><span><xsl:value-of select="rows/content/form_1/fields/email/label"/></span></label><input type="email" value="{rows/content/form_1/fields/email/value}" class="form-control  " inputmask="" id="{rows/content/form_1/fields/email/@name}" name="{rows/content/form_1/fields/email/@name}" maxlength="250" placeholder="{rows/content/form_1/fields/email/@placeholder}"><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_1/fields/email"/></xsl:call-template></input></div></xsl:if><xsl:if test="rows/content/form_1/fields/salario"><div class="form-group col-sm-6   gen-fields-holder" item-name="salario" item-type="number"><label for="{rows/content/form_1/fields/salario/@name}"><span><xsl:value-of select="rows/content/form_1/fields/salario/label"/></span></label><input type="number" value="{rows/content/form_1/fields/salario/value}" min="" max="" class="form-control  " id="{rows/content/form_1/fields/salario/@name}" name="{rows/content/form_1/fields/salario/@name}" maxlength="250" placeholder=""><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_1/fields/salario"/></xsl:call-template></input></div></xsl:if><xsl:if test="rows/content/form_1/fields/data_de_contratacao"><div class="form-group col-sm-6  gen-date-picker-wrapper gen-fields-holder" item-name="data_de_contratacao" item-type="date"><label for="{rows/content/form_1/fields/data_de_contratacao/@name}"><span><xsl:value-of select="rows/content/form_1/fields/data_de_contratacao/label"/></span></label><div class="input-group"><input type="text" value="{rows/content/form_1/fields/data_de_contratacao/value}" datefield="true" disableWeekends="false" disabledBeforetoday="false" data-range="false" class="form-control gen-date-picker " id="data_de_contratacao" name="{rows/content/form_1/fields/data_de_contratacao/@name}" format="" maxlength="250" placeholder=""><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_1/fields/data_de_contratacao"/></xsl:call-template></input><span class="datepicker-clear fa fa-times"/><span class="input-group-btn gen-date-icon"><a class="btn btn-primary"><i class="fa fa-calendar"/></a></span></div></div></xsl:if><xsl:if test="rows/content/form_1/fields/telefone"><div class="form-group col-sm-6   gen-fields-holder" item-name="telefone" item-type="text"><label for="{rows/content/form_1/fields/telefone/@name}"><span><xsl:value-of select="rows/content/form_1/fields/telefone/label"/></span></label><input type="text" value="{rows/content/form_1/fields/telefone/value}" class="form-control  " inputmask="" id="{rows/content/form_1/fields/telefone/@name}" name="{rows/content/form_1/fields/telefone/@name}" disablehtml="true" maxlength="250" placeholder="{rows/content/form_1/fields/telefone/@placeholder}"><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_1/fields/telefone"/></xsl:call-template></input></div></xsl:if><xsl:if test="rows/content/form_1/fields/funcao"><div class="col-sm-6 form-group  gen-fields-holder" item-name="funcao" item-type="select"><label for="{rows/content/form_1/fields/funcao/@name}"><xsl:value-of select="rows/content/form_1/fields/funcao/label"/></label><select class="form-control select2  " id="form_1_funcao" name="{rows/content/form_1/fields/funcao/@name}" placeholder=""><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_1/fields/funcao"/></xsl:call-template><xsl:for-each select="rows/content/form_1/fields/funcao/list/option"><option value="{value}" label="{text}"><xsl:if test="@selected='true'"><xsl:attribute name="selected">selected</xsl:attribute></xsl:if><span><xsl:value-of select="text"/></span></option></xsl:for-each></select></div></xsl:if><xsl:if test="rows/content/form_1/fields/departamento"><div class="col-sm-6 form-group  gen-fields-holder" item-name="departamento" item-type="select"><label for="{rows/content/form_1/fields/departamento/@name}"><xsl:value-of select="rows/content/form_1/fields/departamento/label"/></label><select class="form-control select2  " id="form_1_departamento" name="{rows/content/form_1/fields/departamento/@name}" placeholder=""><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_1/fields/departamento"/></xsl:call-template><xsl:for-each select="rows/content/form_1/fields/departamento/list/option"><option value="{value}" label="{text}"><xsl:if test="@selected='true'"><xsl:attribute name="selected">selected</xsl:attribute></xsl:if><span><xsl:value-of select="text"/></span></option></xsl:for-each></select></div></xsl:if><xsl:if test="rows/content/form_1/fields/coordenador"><div class="col-sm-6 form-group  gen-fields-holder" item-name="coordenador" item-type="select"><label for="{rows/content/form_1/fields/coordenador/@name}"><xsl:value-of select="rows/content/form_1/fields/coordenador/label"/></label><select class="form-control select2  " id="form_1_coordenador" name="{rows/content/form_1/fields/coordenador/@name}" placeholder=""><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_1/fields/coordenador"/></xsl:call-template><xsl:for-each select="rows/content/form_1/fields/coordenador/list/option"><option value="{value}" label="{text}"><xsl:if test="@selected='true'"><xsl:attribute name="selected">selected</xsl:attribute></xsl:if><span><xsl:value-of select="text"/></span></option></xsl:for-each></select></div></xsl:if></div></div><xsl:apply-templates select="rows/content/form_1/tools-bar" mode="form-buttons"/></div></xsl:if><xsl:if test="rows/content/toolsbar_1"><div class="toolsbar-holder default gen-container-item " gen-structure="toolsbar" gen-fields=".btns-holder&gt;a.btn" gen-class="" item-name="toolsbar_1"><div class="btns-holder btn-group-lg centralized" role="group"><xsl:apply-templates select="rows/content/toolsbar_1" mode="gen-buttons"><xsl:with-param name="vertical" select="'true'"/><xsl:with-param name="outline" select="'false'"/></xsl:apply-templates></div></div></xsl:if></div></div><div class="gen-column col-sm-2"><div class="gen-inner"/></div></div></div></div></div></div><xsl:call-template name="IGRP-bottom"/></form><script type="text/javascript" src="{$path}/core/igrp/form/igrp.forms.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/inputmask/jquery.inputmask.min.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/inputmask/igrp.inputmask.js?v={$version}"/><script type="text/javascript" src="{$path}/core/moment/moment.min.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/datepicker2/daterangepicker.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/datepicker2/IGRP.daterangepicker.config.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/datepicker2/locale/dp.locale.pt.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/select2/select2.full.min.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/select2/select2.init.js?v={$version}"/></body></html></xsl:template><xsl:include href="../../../xsl/tmpl/IGRP-functions.tmpl.xsl?v=6"/><xsl:include href="../../../xsl/tmpl/IGRP-variables.tmpl.xsl?v=6"/><xsl:include href="../../../xsl/tmpl/IGRP-home-include.tmpl.xsl?v=6"/><xsl:include href="../../../xsl/tmpl/IGRP-utils.tmpl.xsl?v=6"/><xsl:include href="../../../xsl/tmpl/IGRP-form-utils.tmpl.xsl?v=6"/></xsl:stylesheet>