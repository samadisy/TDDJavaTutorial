package com.fikrlabs.post.test;

import com.fikrlabs.post.Post;
import junit.framework.TestCase;
import org.junit.Test;

public class GroceryStoreTests {

    //make cash sale (1, 2, n)
    @Test
    public void testSaleItem(){
        String HersheysChocolateUPC = "4567";
        String PepsiUPC = "12345";
        Post.addItemToInventory(PepsiUPC, 1.00);
        Post.addItemToInventory(HersheysChocolateUPC, 0.50);

        Post.scan(PepsiUPC);
        TestCase.assertEquals(
                "A can of Pepsi costs $1",
                1.00,
                Post.getTotal(),
                0.01
        );


        Post.scan(HersheysChocolateUPC);
        TestCase.assertEquals(
                "A can of Pepsi costs $1, and chocolate bar is $0.50",
                1.50,
                Post.getTotal(),
                0.01
        );

    }


    //print receipts
    //returns
    //make a credit card sale
}
