package com.Model;

public class Stock {




    public int stockBarcode;
    public String stockName;
    public float stockPrice;
    public int stockQuantity;



    public Stock(int stockBarcode, String stockName, float stockPrice, int stockQuantity)
    {
        this.stockBarcode = stockBarcode;
        this.stockName = stockName;
        this.stockPrice = stockPrice;
        this.stockQuantity = stockQuantity;
    }
    public String toString(){
        return stockBarcode+""+stockName+""+stockPrice;
    }

    public int getStockBarcode()
    {
        return stockBarcode;
    }
    public void setStockBarcode(int stockBarcode)
    {
        this.stockBarcode = stockBarcode;
    }
    public String getStockName()
    {
        return  stockName;
    }
    public void  setStockName(String stockName)
    {
        this.stockName = stockName;
    }
    public float getStockPrice()
    {
        return  stockPrice;
    }
    public void setStockPrice(float stockPrice)
    {
        this.stockPrice = stockPrice;
    }

    public int getStockQuantity()
    {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity)
    {
        this.stockQuantity = stockQuantity;
    }

    public String getReciept() {
        String text = "";

        text = Integer.toString(stockBarcode) + " " + stockName + " £" + Float.toString(stockPrice);

        return text;
    }
}



