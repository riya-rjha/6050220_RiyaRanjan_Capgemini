class Temperature {

    public static int toFarenheit(double celsius) {
        int far = (int) Math.round(celsius * (9 / (double) 5)  + 32); 
        return far;
    }

    public static int toCelsius(double farenheit) {
        int celsius = (int) Math.round((farenheit - 32) * (5 / (double) 9)); 
        return celsius;
    }

    public static void convert(String type, double value) {
        if(type.equals("CtoF")) {
            System.out.println(toFarenheit(value) + " ^F");
        } else if(type.equals("FtoC")) {
            System.out.println(toCelsius(value) + " ^C");
        }
    }

}

class TemperatureConverstion {

    public static void main(String[] args) {
        int tempC = 100;
        System.out.println(Temperature.toFarenheit(tempC));
        int tempF = 100;
        System.out.println(Temperature.toCelsius(tempF));
    }
}
