import java.util.ArrayList;

public class Park {
    private ArrayList<Attraction> attractions;

    public Park() {
        this.attractions = new ArrayList<>();
    }

    public void addAttraction(String name, String workingHours, float price) {
        this.attractions.add(new Attraction(name, workingHours, price));
    }

    public void allAttractions() {
        for (Attraction attraction : attractions) {
            System.out.println("Название: " + attraction.name);
            System.out.println("Время работы: " + attraction.workingHours);
            System.out.println("Стоимость: " + attraction.price);
            System.out.println();
        }
    }

    private class Attraction {
        private String name;
        private String workingHours;
        private float price;

        public Attraction(String name, String workingHours, float price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }
    }

    public static void main(String[] args) {
        Park park = new Park();
        park.addAttraction("Американские горки", "10:00 - 18:00", 400f);
        park.addAttraction("Колесо обозрения", "12:00 - 21:00", 250f);
        park.addAttraction("Бустер>", "12:00 - 20:00", 550f);

        park.allAttractions();
    }
}
