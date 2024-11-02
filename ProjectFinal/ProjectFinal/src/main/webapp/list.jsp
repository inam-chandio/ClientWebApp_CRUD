<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="/includes/header.jsp" />

<style>
    /* General Styling */
    h2, h3 {
        color: #333;
        text-align: center;
    }
    
    .section {
        margin-top: 20px;
        padding: 10px;
        border: 1px solid #ddd;
        border-radius: 5px;
        background-color: #f8f9fa;
    }
    
    .section h3 {
        color: #007bff;
        font-weight: bold;
        margin-bottom: 10px;
    }
    
    table {
        width: 100%;
        border-collapse: collapse;
        margin-top: 10px;
    }
    
    th, td {
        padding: 8px;
        text-align: left;
        border: 1px solid #ddd;
        font-size: 0.9em;
        word-wrap: break-word;
    }
    
    th {
        background-color: #007bff;
        color: white;
        font-weight: bold;
    }
    
    /* Close Button */
    .close-button {
        background-color: #007bff;
        color: white;
        padding: 10px 15px;
        text-decoration: none;
        border-radius: 5px;
        margin: 20px auto;
        display: block;
        width: 100px;
        text-align: center;
    }
    
    .close-button:hover {
        background-color: #0056b3;
    }
</style>

<h2>Client Details</h2>

<div class="section">
    <h3>Client Information</h3>
    <table>
        <tr>
            <td><strong>Client ID:</strong></td>
            <td>${client.id}</td>
            <td><strong>Client Name:</strong></td>
            <td>${client.clientName}</td>
        </tr>
        <tr>
            <td><strong>Observations:</strong></td>
            <td colspan="3">${client.observations}</td>
        </tr>
    </table>
</div>

<div class="section">
    <h3>Affiliation Data</h3>
    <table>
        <tr>
            <td><strong>Social Name:</strong></td>
            <td>${client.socialName}</td>
            <td><strong>NIF:</strong></td>
            <td>${client.nif}</td>
        </tr>
        <tr>
            <td><strong>Responsible:</strong></td>
            <td>${client.responsiblePerson}</td>
            <td><strong>Type of Person:</strong></td>
            <td>${client.personType}</td>
        </tr>
        <tr>
            <td><strong>Commercial Contact:</strong></td>
            <td>${client.commercialContact}</td>
            <td><strong>Phone 1:</strong></td>
            <td>${client.phone1}</td>
        </tr>
        <tr>
            <td><strong>Personal Contact:</strong></td>
            <td>${client.personalContact}</td>
            <td><strong>Phone 2:</strong></td>
            <td>${client.phone2}</td>
        </tr>
        <tr>
            <td><strong>Email:</strong></td>
            <td>${client.email}</td>
            <td><strong>Activity:</strong></td>
            <td>${client.activity}</td>
        </tr>
        <tr>
            <td><strong>Registration Date:</strong></td>
            <td>${client.registrationDate}</td>
            <td><strong>Last Invoice Date:</strong></td>
            <td>${client.lastInvoiceDate}</td>
        </tr>
    </table>
</div>

<div class="section">
    <h3>Fiscal Address</h3>
    <table>
        <tr>
            <td><strong>Street:</strong></td>
            <td>${client.fiscalStreet}</td>
            <td><strong>Number:</strong></td>
            <td>${client.fiscalNumber}</td>
        </tr>
        <tr>
            <td><strong>Floor:</strong></td>
            <td>${client.fiscalFloor}</td>
            <td><strong>Door:</strong></td>
            <td>${client.fiscalDoor}</td>
        </tr>
        <tr>
            <td><strong>Municipality:</strong></td>
            <td>${client.fiscalMunicipality}</td>
            <td><strong>Postal Code:</strong></td>
            <td>${client.fiscalPostalCode}</td>
        </tr>
        <tr>
            <td><strong>Province:</strong></td>
            <td>${client.fiscalProvince}</td>
            <td><strong>Phone:</strong></td>
            <td>${client.fiscalPhone}</td>
        </tr>
    </table>
</div>

<div class="section">
    <h3>Shipping Address</h3>
    <table>
        <tr>
            <td><strong>Street:</strong></td>
            <td>${client.shippingStreet}</td>
            <td><strong>Number:</strong></td>
            <td>${client.shippingNumber}</td>
        </tr>
        <tr>
            <td><strong>Floor:</strong></td>
            <td>${client.shippingFloor}</td>
            <td><strong>Door:</strong></td>
            <td>${client.shippingDoor}</td>
        </tr>
        <tr>
            <td><strong>Municipality:</strong></td>
            <td>${client.shippingMunicipality}</td>
            <td><strong>Postal Code:</strong></td>
            <td>${client.shippingPostalCode}</td>
        </tr>
        <tr>
            <td><strong>Province:</strong></td>
            <td>${client.shippingProvince}</td>
            <td><strong>Country:</strong></td>
            <td>${client.shippingCountry}</td>
        </tr>
    </table>
</div>

<div class="section">
    <h3>Accounting Link</h3>
    <table>
        <tr>
            <td><strong>Account:</strong></td>
            <td>${client.accountNumber}</td>
            <td><strong>Retention:</strong></td>
            <td>${client.retention}</td>
        </tr>
        <tr>
            <td><strong>Equivalent Receipt:</strong></td>
            <td>${client.receiptEquivalent}</td>
            <td><strong>Canary Islands Tax %:</strong></td>
            <td>${client.canaryIslandsTax}</td>
        </tr>
    </table>
</div>

<div class="section">
    <h3>Billing Characteristics</h3>
    <table>
        <tr>
            <td><strong>Payment Method:</strong></td>
            <td>${client.paymentMethod}</td>
            <td><strong>Due Dates:</strong></td>
            <td>${client.dueDates}</td>
        </tr>
        <tr>
            <td><strong>Payment Days:</strong></td>
            <td>${client.paymentDays}</td>
            <td><strong>Discount:</strong></td>
            <td>${client.discount}</td>
        </tr>
        <tr>
            <td><strong>Risk Level:</strong></td>
            <td>${client.riskLevel}</td>
            <td><strong>Max Credit:</strong></td>
            <td>${client.maxCredit}</td>
        </tr>
        <tr>
            <td><strong>Invoice Format:</strong></td>
            <td>${client.invoiceFormat}</td>
            <td><strong>Receipt Format:</strong></td>
            <td>${client.receiptFormat}</td>
        </tr>
    </table>
</div>

<a href="#" class="close-button" onclick="window.close();">Close</a>

<jsp:include page="/includes/footer.jsp" />
