package day5;

public class Car {
        private String model;
        private String color;
        private int yearManufacture;

        public void setModel(String publicModel) {

            model = publicModel;
        }

        public void setColor(String publicColor) {

            color = publicColor;
        }

        public void setYearManufacture(int publicYearManufacture) {

            yearManufacture = publicYearManufacture;
        }

        public String getModel() {

            return model;
        }

        public String getColor() {

            return color;
        }

        public int getYearManufacture() {

            return yearManufacture;
        }

    }

