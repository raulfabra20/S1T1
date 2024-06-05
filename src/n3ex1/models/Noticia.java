package n3ex1.models;


    public abstract class Noticia {
        protected String titular;
        protected String text;
        protected int puntuacio;
        protected int preu;

        public Noticia(String titular, String text) {
            super();
            this.titular = titular;
            this.text = text;
            this.puntuacio = calcularPuntsNoticia();
            this.preu = calcularPreuNoticia();
        }

        public String getTitular() {
            return titular;
        }

        public void setTitular(String titular) {
            this.titular = titular;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public int getPuntuacio() {
            return puntuacio;
        }

        public void setPuntuacio(int puntuacio) {
            this.puntuacio = puntuacio;
        }

        public int getPreu() {
            return preu;
        }

        public void setPreu(int preu) {
            this.preu = preu;
        }

        public abstract int calcularPreuNoticia();

        public abstract byte calcularPuntsNoticia();


    }


