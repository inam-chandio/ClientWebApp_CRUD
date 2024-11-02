<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="/includes/header.jsp" />

<h2>Edit Client</h2>
<form action="${pageContext.request.contextPath}/clients/update" method="post">
    <input type="hidden" name="id" value="${client.id}">

    <label>Client Name:</label><input type="text" name="clientName" value="${client.clientName}" required><br>

    <label>Observations:</label><textarea name="observations">${client.observations}</textarea><br>

    <label>Page Number:</label><input type="number" name="pageNumber" value="${client.pageNumber}"><br>

    <label>Social Name:</label><input type="text" name="socialName" value="${client.socialName}"><br>

    <label>Responsible Person:</label><input type="text" name="responsiblePerson" value="${client.responsiblePerson}"><br>

    <label>Commercial Contact:</label><input type="text" name="commercialContact" value="${client.commercialContact}"><br>

    <label>Email:</label><input type="email" name="email" value="${client.email}"><br>

    <label>Phone:</label><input type="text" name="phone" value="${client.phone}"><br>

    <label>Fiscal Address:</label><input type="text" name="fiscalAddress" value="${client.fiscalAddress}"><br>

    <label>Shipping Address:</label><input type="text" name="shippingAddress" value="${client.shippingAddress}"><br>

    <label>Accounting Link:</label><input type="text" name="accountingLink" value="${client.accountingLink}"><br>

    <label>Invoice Format:</label><input type="text" name="invoiceFormat" value="${client.invoiceFormat}"><br>

    <label>Payment Method:</label><input type="text" name="paymentMethod" value="${client.paymentMethod}"><br>

    <label>Risk Level:</label><input type="text" name="riskLevel" value="${client.riskLevel}"><br>

    <label>Max Credit:</label><input type="number" step="0.01" name="maxCredit" value="${client.maxCredit}"><br><br>

    <input type="submit" value="Update Client">
</form>

<jsp:include page="/includes/footer.jsp" />
