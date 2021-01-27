package com.Model;

import com.IGui;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Model {

private final ArrayList<Stock> stockList = new ArrayList<>();
private final ArrayList<IGui> viewList = new ArrayList<>();

    public Model() {
        readData();
        testFunction();
    }

    public void testFunction() {
        for (int i = 0; i < stockList.size(); i++) {
            System.out.println(stockList.get(i).getReciept());
        }
    }


    public void readData() {

        stockList.clear();

        try {

            File file = new File("resources\\Shop.txt");

            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {

                String[] data = scanner.nextLine().trim().split("\\|");

                Stock stock = new Stock(Integer.parseInt(data[0]), data[1], Float.parseFloat(data[2]), Integer.parseInt(data[3]));
                stockList.add(stock);
            }
            scanner.close();


        } catch (FileNotFoundException a) {

            System.out.println("error" + a.getMessage());

        }

    }
    public Stock getStock(int barcode) {
        for(int c = 0; c < stockList.size(); c++) {

            if (stockList.get(c).getStockBarcode() == barcode) {
                return stockList.get(c);
            }
        }
        return null;
    }

    public void addView(IGui view) {
        viewList.add(view);

    }

}
