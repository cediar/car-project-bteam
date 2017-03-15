<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<spring:url value="/resources/css/hello-world-spring.css" var="helloCss" />
<spring:url value="/resources/css/font-awesome.css" var="fontAwesome" />
<spring:url value="/resources/css/bootstrap.min.css" var="bootstrapCSS" />
<link href="${helloCss}" rel="stylesheet" />
<link href="${fontAwesome}" rel="stylesheet" />
<link href="${bootstrapCSS}" rel="stylesheet" />
<title><spring:message code="Addcar"/></title>
</head>
<body>
    <div class="container">
        <div class="page-header">
            <h2><i class="fa fa-plus-square" aria-hidden="true"></i><spring:message code="Addcar"/></h2>
        </div>
        <div class="row">
            <p class="form-intro col-sm-offset-2 col-sm-10">Campos requeridos *(<abbr class="required" title="required">*</abbr>)</p> 
        </div>
        <div class="row">
            <form:form modelAttribute="car" cssClass="form-horizontal">
                <div class="form-group">
                    <form:label cssClass="col-sm-3 control-label" path="matricula">
                        <spring:message code="Enrollment"/><abbr class="required" title="required"> * </abbr>
                    </form:label>
                    <div class="col-sm-4">
                        <form:input  cssClass="form-control" path="" />
                    </div>
                    <div class="col-sm-5 error">
<%--                         <form:error path="matricula" /> --%>
                    </div>
                </div>
                <div class="form-group">
                    <form:label cssClass="col-sm-3 control-label" path="modelo">
                        <spring:message code="Model"/> <abbr class="required" title="required"> * </abbr>
                    </form:label>
                    <div class="col-sm-4">
                        <form:input cssClass="form-control" path="" />
                    </div>
                    <div class="col-sm-5 error">
<%--                         <form:error path="modelo" /> --%>
                    </div>
                </div>
                
                <div class="form-group">
                    <form:label cssClass="col-sm-3 control-label" path="fechaMatriculacion">
                        <spring:message code="Registrationdat"/> <abbr class="required" title="required"> * </abbr>
                    </form:label>
                    <div class="col-sm-4">
                        <form:input cssClass="form-control" path="" placeholder="dd/mm/yyyy"/>
                    </div>
                    <div class="col-sm-5 error">
<%--                         <form:error path="fechaMatriculacion" /> --%>
                    </div>
                </div>
                <div class="form-group">
                    <form:label cssClass="col-sm-3 control-label" path="km">
                        <spring:message code="Km"/> <abbr class="required" title="required"> * </abbr>
                    </form:label>
                    <div class="col-sm-4">
                        <form:input cssClass="form-control" path=""/>
                    </div>
                    <div class="col-sm-5 error">
<%--                         <form:error path="km" /> --%>
                    </div>
                </div>
                
                <div class="form-group">
                    <form:label cssClass="col-sm-3 control-label" path="precio">
                        <spring:message code="Price"/> <abbr class="required" title="required"> * </abbr>
                    </form:label>
                    <div class="col-sm-4">
                        <form:input cssClass="form-control" path="" />
                    </div>
                    <div class="col-sm-5 error">
<%--                         <form:error path="precio" /> --%>
                    </div>
                </div>
                <div class="form-group col-sm-7 text-right">
                    <a href="" class="btn btn-default" role="button">
                        <i class="fa fa-arrow-left" aria-hidden="true"></i>
                        <spring:message code="Return"/>
                    </a>
                    <button type="submit" class="btn btn-primary">
                        <i class="fa fa-floppy-o" aria-hidden="true"></i>
                        <spring:message code="Save"/>
                    </button>
                </div>
            </form:form>
        </div>
    </div>
</body>
<spring:url value="/resources/js/hello-world-spring.js" var="helloJS" />
<spring:url value="/resources/js/jquery.min.js" var="helloJQuery" />
<spring:url value="/resources/js/bootstrap.min.js" var="bootstrapJS" />
<script src="${helloJQuery}"></script>
<script src="${bootstrapJS}"></script>
<script src="${helloJS}"></script>
</html>