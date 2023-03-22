<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0"><xsl:output method="html" omit-xml-declaration="yes" encoding="utf-8" indent="yes" doctype-system="about:legacy-compat"/><xsl:template match="/"><html><head><xsl:call-template name="IGRP-head"/><link rel="stylesheet" type="text/css" href="{$path}/core/igrp/table/datatable/dataTables.bootstrap.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/core/igrp/table/igrp.tables.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/core/igrp/table/table-colors.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/core/igrp/toolsbar/toolsbar.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/plugins/select2/select2.min.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/plugins/select2/select2.style.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/plugins/colorpicker/css/bootstrap-colorpicker.min.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/plugins/datepicker2/daterangepicker.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/plugins/datepicker2/IGRP.daterangepicker.css?v={$version}"/><style/></head><body class="{$bodyClass} sidebar-off"><xsl:call-template name="IGRP-topmenu"/><form method="POST" class="IGRP-form" name="formular_default" enctype="multipart/form-data"><div class="container-fluid"><div class="row"><xsl:call-template name="IGRP-sidebar"/><div class="col-sm-9 col-md-10 col-md-offset-2 col-sm-offset-3 main" id="igrp-contents"><div class="content"><div class="row row-msg"><div class="gen-column col-md-12"><div class="gen-inner"><xsl:apply-templates mode="igrp-messages" select="rows/content/messages"/></div></div></div><div class="row " id="row-06571855"><div class="gen-column col-sm-8"><div class="gen-inner"><xsl:if test="rows/content/form_1"><div class="box igrp-forms gen-container-item " gen-class="" item-name="form_1"><xsl:call-template name="box-header"><xsl:with-param name="title" select="rows/content/form_1/@title"/><xsl:with-param name="collapsible" select="'true'"/><xsl:with-param name="collapsed" select="'false'"/></xsl:call-template><div class="box-body"><div role="form"><xsl:apply-templates mode="form-hidden-fields" select="rows/content/form_1/fields"/><xsl:if test="rows/content/form_1/fields/departamento_id"><div class="col-sm-6 form-group  gen-fields-holder" item-name="departamento_id" item-type="select"><label for="{rows/content/form_1/fields/departamento_id/@name}"><xsl:value-of select="rows/content/form_1/fields/departamento_id/label"/></label><select class="form-control select2  " id="form_1_departamento_id" name="{rows/content/form_1/fields/departamento_id/@name}" placeholder=""><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_1/fields/departamento_id"/></xsl:call-template><xsl:for-each select="rows/content/form_1/fields/departamento_id/list/option"><option value="{value}" label="{text}"><xsl:if test="@selected='true'"><xsl:attribute name="selected">selected</xsl:attribute></xsl:if><span><xsl:value-of select="text"/></span></option></xsl:for-each></select></div></xsl:if><xsl:if test="rows/content/form_1/fields/funcao_id"><div class="col-sm-6 form-group  gen-fields-holder" item-name="funcao_id" item-type="select"><label for="{rows/content/form_1/fields/funcao_id/@name}"><xsl:value-of select="rows/content/form_1/fields/funcao_id/label"/></label><select class="form-control select2  " id="form_1_funcao_id" name="{rows/content/form_1/fields/funcao_id/@name}" placeholder=""><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/form_1/fields/funcao_id"/></xsl:call-template><xsl:for-each select="rows/content/form_1/fields/funcao_id/list/option"><option value="{value}" label="{text}"><xsl:if test="@selected='true'"><xsl:attribute name="selected">selected</xsl:attribute></xsl:if><span><xsl:value-of select="text"/></span></option></xsl:for-each></select></div></xsl:if></div></div><xsl:apply-templates select="rows/content/form_1/tools-bar" mode="form-buttons"/></div></xsl:if></div></div><div class="gen-column col-sm-4"><div class="gen-inner"><xsl:if test="rows/content/sectionheader_1"><section class="content-header gen-container-item " gen-class="" item-name="sectionheader_1"><h2 class="disable-output-escaping"><xsl:value-of disable-output-escaping="yes" select="rows/content/sectionheader_1/fields/sectionheader_1_text/value"/></h2></section></xsl:if><xsl:if test="rows/content/registar_frias"><div class="toolsbar-holder default gen-container-item " gen-structure="toolsbar" gen-fields=".btns-holder&gt;a.btn" gen-class="" item-name="registar_frias"><div class="btns-holder btn-group-lg btn-group-justified" role="group"><xsl:apply-templates select="rows/content/registar_frias" mode="gen-buttons"><xsl:with-param name="vertical" select="'true'"/><xsl:with-param name="outline" select="'false'"/></xsl:apply-templates></div></div></xsl:if></div></div></div><div class="row " id="row-a36d3223"><div class="gen-column col-sm-12"><div class="gen-inner"><xsl:if test="rows/content/table_1"><div class="box box-table-contents gen-container-item " gen-class="" item-name="table_1"><div class="box-body "><div class="table-contents-head"><div class="table-contents-inner"><xsl:apply-templates mode="table-legend" select="rows/content/table_1/table/legend_color"/></div></div><div class="table-box"><div class="table-box-inner"><table id="table_1" class="table table-striped   IGRP_contextmenu " exports=""><thead><tr><xsl:if test="rows/content/table_1/fields/status_legen"><th td-name="status_legen" align="left" class="color-th gen-fields-holder" group-in=""><xsl:value-of select="rows/content/table_1/fields/status_legen/label"/></th></xsl:if><xsl:if test="rows/content/table_1/fields/departamento"><th td-name="departamento" align="left" show-label="true" class="text  gen-fields-holder" group-in=""><span><xsl:value-of select="rows/content/table_1/fields/departamento/label"/></span></th></xsl:if><xsl:if test="rows/content/table_1/fields/funcao"><th td-name="funcao" align="left" show-label="true" class="text  gen-fields-holder" group-in="funcionario"><span><xsl:value-of select="rows/content/table_1/fields/funcao/label"/></span></th></xsl:if><xsl:if test="rows/content/table_1/fields/funcionario"><th td-name="funcionario" align="left" show-label="true" class="text  gen-fields-holder" group-in=""><span><xsl:value-of select="rows/content/table_1/fields/funcionario/label"/></span></th></xsl:if><xsl:if test="rows/content/table_1/fields/inicio_em"><th td-name="inicio_em" align="left" show-label="true" class="date  gen-fields-holder" group-in=""><span><xsl:value-of select="rows/content/table_1/fields/inicio_em/label"/></span></th></xsl:if><xsl:if test="rows/content/table_1/fields/dias"><th td-name="dias" align="left" show-label="true" class="number  gen-fields-holder" group-in="inicio_em"><span><xsl:value-of select="rows/content/table_1/fields/dias/label"/></span></th></xsl:if><xsl:if test="rows/content/table_1/fields/aprovador"><th td-name="aprovador" align="left" show-label="true" class="text  gen-fields-holder" group-in=""><span><xsl:value-of select="rows/content/table_1/fields/aprovador/label"/></span></th></xsl:if><xsl:if test="rows/content/table_1/fields/estado"><th td-name="estado" align="left" show-label="true" class="text  gen-fields-holder" group-in=""><span><xsl:value-of select="rows/content/table_1/fields/estado/label"/></span></th></xsl:if><xsl:if test="rows/content/table_1/table/context-menu/item"><th class="igrp-table-ctx-th"/></xsl:if></tr></thead><tbody><xsl:for-each select="rows/content/table_1/table/value/row[not(@total='yes')]"><tr><xsl:apply-templates mode="context-param" select="context-menu"/><input type="hidden" name="p_id_fk" value="{id}"/><input type="hidden" name="p_id_fk_desc" value="{id_desc}"/><xsl:if test="status_legen"><td align="" data-row="{position()}" data-title="{../../label/status_legen}" class="color" item-name="status_legen" data-sort="{status_legen}"><xsl:call-template name="tdcolor"><xsl:with-param name="color" select="status_legen"/></xsl:call-template></td></xsl:if><xsl:if test="departamento"><td align="left" data-order="{departamento}" data-row="{position()}" data-title="{../../../fields/departamento/label}" class="text" item-name="departamento"><span class=""><xsl:value-of select="departamento"/></span></td></xsl:if><xsl:if test="funcao"><td align="left" data-order="{funcao}" data-row="{position()}" data-title="{../../../fields/funcao/label}" class="text" item-name="funcao"><span class=""><xsl:value-of select="funcao"/></span></td></xsl:if><xsl:if test="funcionario"><td align="left" data-order="{funcionario}" data-row="{position()}" data-title="{../../../fields/funcionario/label}" class="text" item-name="funcionario"><span class=""><xsl:value-of select="funcionario"/></span></td></xsl:if><xsl:if test="inicio_em"><td align="left" data-order="{inicio_em}" data-row="{position()}" data-title="{../../../fields/inicio_em/label}" class="date" item-name="inicio_em"><span class=""><xsl:value-of select="inicio_em"/></span></td></xsl:if><xsl:if test="dias"><td align="left" data-order="{dias}" data-row="{position()}" data-title="{../../../fields/dias/label}" class="number" item-name="dias"><span class=""><xsl:value-of select="dias"/></span></td></xsl:if><xsl:if test="aprovador"><td align="left" data-order="{aprovador}" data-row="{position()}" data-title="{../../../fields/aprovador/label}" class="text" item-name="aprovador"><span class=""><xsl:value-of select="aprovador"/></span></td></xsl:if><xsl:if test="estado"><td align="left" data-order="{estado}" data-row="{position()}" data-title="{../../../fields/estado/label}" class="text" item-name="estado"><span class=""><xsl:value-of select="estado"/></span></td></xsl:if><xsl:if test="//rows/content/table_1/table/context-menu/item"><td class="igrp-table-ctx-td"><xsl:apply-templates select="../../context-menu" mode="table-context-inline"><xsl:with-param name="row-params" select="context-menu"/><xsl:with-param name="type" select="'inl'"/></xsl:apply-templates></td></xsl:if></tr></xsl:for-each></tbody></table></div></div></div></div></xsl:if></div></div></div></div></div></div></div><xsl:call-template name="IGRP-bottom"/></form><script type="text/javascript" src="{$path}/core/igrp/form/igrp.forms.js?v={$version}"/><script type="text/javascript" src="{$path}/core/igrp/table/datatable/jquery.dataTables.min.js?v={$version}"/><script type="text/javascript" src="{$path}/core/igrp/table/datatable/dataTables.bootstrap.min.js?v={$version}"/><script type="text/javascript" src="{$path}/core/igrp/table/igrp.table.js?v={$version}"/><script type="text/javascript" src="{$path}/core/igrp/table/bootstrap-contextmenu.js?v={$version}"/><script type="text/javascript" src="{$path}/core/igrp/table/table.contextmenu.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/select2/select2.full.min.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/select2/select2.init.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/colorpicker/js/bootstrap-colorpicker.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/colorpicker/colorpicker.init.js?v={$version}"/><script type="text/javascript" src="{$path}/core/moment/moment.min.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/datepicker2/daterangepicker.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/datepicker2/IGRP.daterangepicker.config.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/datepicker2/locale/dp.locale.pt.js?v={$version}"/></body></html></xsl:template><xsl:include href="../../../xsl/tmpl/IGRP-functions.tmpl.xsl?v=22"/><xsl:include href="../../../xsl/tmpl/IGRP-variables.tmpl.xsl?v=22"/><xsl:include href="../../../xsl/tmpl/IGRP-home-include.tmpl.xsl?v=22"/><xsl:include href="../../../xsl/tmpl/IGRP-utils.tmpl.xsl?v=22"/><xsl:include href="../../../xsl/tmpl/IGRP-form-utils.tmpl.xsl?v=22"/><xsl:include href="../../../xsl/tmpl/IGRP-table-utils.tmpl.xsl?v=22"/></xsl:stylesheet>
