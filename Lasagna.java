public class Lasagna {
    // Define the 'expectedMinutesInOven' method
    public int expectedMinutesInOven() {
        return 40;
    }
    
    // Define the 'remainingMinutesInOven' method
    public int remainingMinutesInOven(int minsInOven) {
        return expectedMinutesInOven() - minsInOven;
    }
    

    // Define the 'preparationTimeInMinutes' method
    public int preparationTimeInMinutes(int layers) {
        return layers * 2;
    }


    // Define the 'totalTimeInMinutes' method
    public int totalTimeInMinutes(int layers, int minsInOven) {
        return preparationTimeInMinutes(layers) + minsInOven;
    }


}
