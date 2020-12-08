<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<div class="container">
<h1>Add a Todo </h1>
<form:form method="post" modelAttribute="todo">
    <form:hidden path="id"/>
    <fieldset class="form-group">
        <form:label path="desc">Description: </form:label>
        <form:input type="text" path="desc" class="form-control" required="required"/>
        <form:errors path="desc" cssClass="text-warning" />
    </fieldset><br/>

    <fieldset class="form-group">
        <form:label path="targetDate">Target Date:</form:label>
        <form:input type="text" path="targetDate"
            class="form-control"/>
        <form:errors path="targetDate" cssClass="text-warning" />
    </fieldset><br/>

    <fieldset class="form-group">
        <form:label path="done">Status:</form:label>
        <form:input type="text" path="done" class="form-control"/>
    </fieldset><br/>

    <button type="submit" class="btn btn-success">Submit</button>
</form:form>
</div>
<%@ include file="common/footer.jspf"%>