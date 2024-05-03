public class Main {
    public static void main(String[] args) {
        Knight knight = new Knight();
        knight.goAndSaveThePrincess();
    }
}
    class Knight {
        private String name = "Sir Thanks-A-Lota";
        private String weapon = "Long Sword";
        private Boolean isGoingToSavePrincess = true;

        public static void main(String[] args) {

        }

            public void goAndSaveThePrincess () {
                sharpenBlade();
                getFood();
                assembleTeam();
                getTransport();
                System.out.println("Da idu uzhe.....");
            }

            private void sharpenBlade () {
                System.out.println("Tochim mech");
            }

            private void getFood () {
                System.out.println("Sobiraem konservy");
            }

            private void assembleTeam () {
                System.out.println("Budim oruzhenosca");
            }

            private void getTransport () {
                System.out.println("Sedlaem konia");
            }
    }
