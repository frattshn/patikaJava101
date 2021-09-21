public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int mat2, int fizik,int fizik2, int kimya, int kimya2) {

        if (mat >= 0 && mat <= 100 && mat2>=0 && mat2<=100) {
            this.mat.note = mat;
            this.mat.sozlu= mat2;
        }

        if (fizik >= 0 && fizik <= 100 && fizik2>=0 && fizik2<=100) {
            this.fizik.note = fizik;
            this.fizik.sozlu= fizik2;
        }

        if (kimya >= 0 && kimya <= 100 && kimya2>=0 && kimya2<=100) {
            this.kimya.note = kimya;
            this.kimya.sozlu= kimya2;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0
        		|| this.mat.sozlu == 0 || this.fizik.sozlu == 0 || this.kimya.sozlu == 0) {
            System.out.println("Notlar tam olarak girilmemiþ");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sýnýfý Geçti. ");
            } else {
                System.out.println("Sýnýfta Kaldý.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = ((this.fizik.note*8/10 + this.fizik.sozlu*2/10)+
        		(this.kimya.note*8/10 + this.kimya.sozlu*2/10)+ 
        		this.mat.note*8/10 + this.mat.sozlu*2/10 ) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öðrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note + " Sözlüsü : "+ this.mat.sozlu);
        System.out.println("Fizik Notu : " + this.fizik.note+ " Sözlüsü : "+ this.fizik.sozlu);
        System.out.println("Kimya Notu : " + this.kimya.note+ " Sözlüsü : "+ this.kimya.sozlu);
    }

}