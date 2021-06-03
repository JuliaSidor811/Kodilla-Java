package com.kodillla.hibernate.invoice.dao;

import com.kodillla.hibernate.invoice.Invoice;
import com.kodillla.hibernate.invoice.Item;
import com.kodillla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest

public class InvoiceDaoTestSuite {

    @Autowired
     private InvoiceDao invoiceDao;

    private final String CD = "CD";
    private final String LAPTOP = "LAPTOP";
    private final String TELEPHONE = "TELEPHONE";

    @Test
    void testInvoiceDaoSave() {

        Invoice invoice = new Invoice("New Invoice");

        Item i1 = new Item(new BigDecimal(100.939), 5);
        Item i2 = new Item(new BigDecimal(3922.35), 2);
        Item i3 = new Item(new BigDecimal(2000.28), 10);

        Product p1 = new Product(CD);
        Product p2 = new Product(LAPTOP);
        Product p3 = new Product(TELEPHONE);

        i1.setInvoice(invoice);
        i2.setInvoice(invoice);
        i3.setInvoice(invoice);

        i1.setProduct(p1);
        i2.setProduct(p2);
        i3.setProduct(p3);

        invoice.getItems().add(i1);
        invoice.getItems().add(i2);
        invoice.getItems().add(i3);

        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        assertNotEquals(0, invoiceId);

        try{
            invoiceDao.deleteById(invoiceId);
        }catch (Exception e){
            //...
        }








    }

}
