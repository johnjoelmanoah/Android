package com.example.johnjoelmanoah.classapp;



public class Parse extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //Parse.initialize(this, "ZxAcdcmmBMRPiutCFYqBNPD25xlZUup8ERjTIWIr", "NvNmEySv0XxZ1E85IEnzHf8CBpyrFbCN2OQSdwlg");


        com.parse.Parse.initialize(this, "MvC5c3Je3W0wla9RSgRmNRAEI73qRsS0bWFdVtuV", "bcZnohgIPmKHyAXLoVKniYz7ceXOo4WGNvwtUKPf");
        //Parse.initialize(this, "7gcPFFezfqWyd0P8zTvT0ugNFyxZFsfcsnavfKCO", "vLHNB6qY5x2u3YJFv7xRRFmucgT8wMum1uueQo2o");


    }
}
