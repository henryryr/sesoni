
    public class Seasons {
        enum TimeOfYear {
            WINTER(-10), SPRING(10), SUMMER(25), AUTUMN(15);

            private final int averageTemperature;

            TimeOfYear(int averageTemperature) {
                this.averageTemperature = averageTemperature;
            }

            public int getAverageTemperature() {
                return averageTemperature;
            }

            public String getDescription() {
                return "Холодное время года";
            }

            public void printInfo() {
                System.out.println("Время года: " + this.name());
                System.out.println("Средняя температура: " + this.getAverageTemperature());
                System.out.println("Описание: " + this.getDescription());
            }
        }

        public static void main(String[] args) {
            TimeOfYear myFavoriteSeason = TimeOfYear.SUMMER;
            myFavoriteSeason.printInfo();

            System.out.println("Я люблю лето");

            for (TimeOfYear season : TimeOfYear.values()) {
                season.printInfo();
            }
        }
    }
