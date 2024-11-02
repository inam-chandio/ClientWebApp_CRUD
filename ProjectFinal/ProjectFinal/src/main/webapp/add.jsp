<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="/includes/header.jsp" />

<h2>Add New Client</h2>
<form action="${pageContext.request.contextPath}/clients/add" method="post">
    <label>Client Name:</label><input type="text" name="clientName" required><br>

    <label>Observations:</label><textarea name="observations"></textarea><br>

    <label>Page Number:</label><input type="number" name="pageNumber"><br>

    <label>Social Name:</label><input type="text" name="socialName"><br>

    <label>Responsible Person:</label><input type="text" name="responsiblePerson"><br>

    <label>Commercial Contact:</label><input type="text" name="commercialContact"><br>

    <label>Email:</label><input type="email" name="email"><br>

    <label>Phone:</label><input type="text" name="phone"><br>

    <label>Fiscal Address:</label><input type="text" name="fiscalAddress"><br>

    <label>Shipping Address:</label><input type="text" name="shippingAddress"><br>

    <label>Accounting Link:</label><input type="text" name="accountingLink"><br>

    <label>Invoice Format:</label><input type="text" name="invoiceFormat"><br>

    <label>Payment Method:</label><input type="text" name="paymentMethod"><br>

    <label>Risk Level:</label><input type="text" name="riskLevel"><br>

    <label>Max Credit:</label><input type="number" step="0.01" name="maxCredit"><br><br>

    <input type="submit" value="Add Client">
</form>

<jsp:include page="/includes/footer.jsp" />
