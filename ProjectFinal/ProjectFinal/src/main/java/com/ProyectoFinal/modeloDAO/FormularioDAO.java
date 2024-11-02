package com.ProyectoFinal.modeloDAO;

import com.ProyectoFinal.conexion.Conexion;
import com.ProyectoFinal.modelo.Formulario;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FormularioDAO {

    public List<Formulario> listAllClients() throws SQLException {
        List<Formulario> clients = new ArrayList<>();
        String sql = "SELECT * FROM clients";
        
        try (Connection conn = Conexion.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Formulario client = new Formulario();
                client.setId(rs.getInt("id"));
                client.setClientName(rs.getString("client_name"));
                client.setObservations(rs.getString("observations"));
                client.setPageNumber(rs.getInt("page_number"));
                client.setSocialName(rs.getString("social_name"));
                client.setResponsiblePerson(rs.getString("responsible_person"));
                client.setCommercialContact(rs.getString("commercial_contact"));
                client.setEmail(rs.getString("email"));
                client.setPhone(rs.getString("phone"));
                client.setFiscalAddress(rs.getString("fiscal_address"));
                client.setShippingAddress(rs.getString("shipping_address"));
                client.setAccountingLink(rs.getString("accounting_link"));
                client.setInvoiceFormat(rs.getString("invoice_format"));
                client.setPaymentMethod(rs.getString("payment_method"));
                client.setRiskLevel(rs.getString("risk_level"));
                client.setMaxCredit(rs.getBigDecimal("max_credit"));
                clients.add(client);
            }
        }
        return clients;
    }

    public boolean addClient(Formulario client) throws SQLException {
        String sql = "INSERT INTO clients (client_name, observations, page_number, social_name, responsible_person, commercial_contact, email, phone, fiscal_address, shipping_address, accounting_link, invoice_format, payment_method, risk_level, max_credit) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, client.getClientName());
            ps.setString(2, client.getObservations());
            ps.setInt(3, client.getPageNumber());
            ps.setString(4, client.getSocialName());
            ps.setString(5, client.getResponsiblePerson());
            ps.setString(6, client.getCommercialContact());
            ps.setString(7, client.getEmail());
            ps.setString(8, client.getPhone());
            ps.setString(9, client.getFiscalAddress());
            ps.setString(10, client.getShippingAddress());
            ps.setString(11, client.getAccountingLink());
            ps.setString(12, client.getInvoiceFormat());
            ps.setString(13, client.getPaymentMethod());
            ps.setString(14, client.getRiskLevel());
            ps.setBigDecimal(15, client.getMaxCredit());
            return ps.executeUpdate() > 0;
        }
    }

    public Formulario getClientById(int id) throws SQLException {
        Formulario client = null;
        String sql = "SELECT * FROM clients WHERE id = ?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                client = new Formulario();
                client.setId(rs.getInt("id"));
                client.setClientName(rs.getString("client_name"));
                client.setObservations(rs.getString("observations"));
                client.setPageNumber(rs.getInt("page_number"));
                client.setSocialName(rs.getString("social_name"));
                client.setResponsiblePerson(rs.getString("responsible_person"));
                client.setCommercialContact(rs.getString("commercial_contact"));
                client.setEmail(rs.getString("email"));
                client.setPhone(rs.getString("phone"));
                client.setFiscalAddress(rs.getString("fiscal_address"));
                client.setShippingAddress(rs.getString("shipping_address"));
                client.setAccountingLink(rs.getString("accounting_link"));
                client.setInvoiceFormat(rs.getString("invoice_format"));
                client.setPaymentMethod(rs.getString("payment_method"));
                client.setRiskLevel(rs.getString("risk_level"));
                client.setMaxCredit(rs.getBigDecimal("max_credit"));
            }
            rs.close();
        }
        return client;
    }

    public boolean updateClient(Formulario client) throws SQLException {
        String sql = "UPDATE clients SET client_name = ?, observations = ?, page_number = ?, social_name = ?, responsible_person = ?, commercial_contact = ?, email = ?, phone = ?, fiscal_address = ?, shipping_address = ?, accounting_link = ?, invoice_format = ?, payment_method = ?, risk_level = ?, max_credit = ? WHERE id = ?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, client.getClientName());
            ps.setString(2, client.getObservations());
            ps.setInt(3, client.getPageNumber());
            ps.setString(4, client.getSocialName());
            ps.setString(5, client.getResponsiblePerson());
            ps.setString(6, client.getCommercialContact());
            ps.setString(7, client.getEmail());
            ps.setString(8, client.getPhone());
            ps.setString(9, client.getFiscalAddress());
            ps.setString(10, client.getShippingAddress());
            ps.setString(11, client.getAccountingLink());
            ps.setString(12, client.getInvoiceFormat());
            ps.setString(13, client.getPaymentMethod());
            ps.setString(14, client.getRiskLevel());
            ps.setBigDecimal(15, client.getMaxCredit());
            ps.setInt(16, client.getId());
            return ps.executeUpdate() > 0;
        }
    }

    public boolean deleteClient(int id) throws SQLException {
        String sql = "DELETE FROM clients WHERE id = ?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        }
    }
}
