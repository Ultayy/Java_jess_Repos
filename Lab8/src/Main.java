import java.io.*;

public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[6];
        products[0] = new TV(123, 1000, "Samsung", 30);
        products[1] = new TV(456, 2000, "Sony", 50);
        products[2] = new Book(753, 60, "Under the sky", "Sun press", 1992);
        products[3] = new Book(951, 50, "Java programming", "Springer", 2005);
        products[4] = new ChildrenBook(258, 20, "Kurtlar", "Morsik", 2011, 11);
        products[5] = new ChildrenBook(179, 28, "Ormanda", "Morsik", 2014, 14);
        double averageAge=0;
        double total=0;
        int c=0;
        for (int i = 0; i < 6; i++) {
            System.out.println(products[i].computeSalePrice());
            total+=products[i].computeSalePrice();
            if(products[i] instanceof ChildrenBook)
            {
                c+=1;
                averageAge+=((ChildrenBook) products[i]).getAge();
            }
        }
        System.out.println("total price = " + total);
        System.out.println("Average age = " + averageAge/c);

        FileInputStream fis =null;
        ObjectInputStream ois = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        BufferedReader br = null;
        try {
            File file = new File("Books.txt");
            if(!file.exists()){
                file.createNewFile();
                fos = new FileOutputStream(file);
                oos = new ObjectOutputStream(fos);
                oos.writeObject(products[0]);
                oos.writeObject(products[1]);
                oos.writeObject(products[2]);
                oos.writeObject(products[3]);
                oos.writeObject(products[4]);
                oos.writeObject(products[5]);
            }
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            products = (Product[]) ois.readObject();
//            System.out.printf("product = %s, number = %s", products);

                br = new BufferedReader(new FileReader("Books.txt"));
                String line;
                while ((line = br.readLine()) != null){
                    System.out.println(line);
                }
                }
        catch (IOException | ClassNotFoundException e){
            System.out.println("Error! " + e);
        }
        finally

    {
        try {
            fos.close();
            oos.close();
            br.close();
            fis.close();
            ois.close();
        } catch (IOException e) {
            System.out.println("Error! " + e);
        }
    }
    }
}