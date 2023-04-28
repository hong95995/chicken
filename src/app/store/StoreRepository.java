package app.store;

import java.util.Scanner;

public class StoreRepository {
    private Store[] stores = new Store[0];

    public void addStore(Scanner scanner) {
        Store[] newStores = new Store[stores.length + 1];
        System.arraycopy(stores, 0, newStores, 0, stores.length);

        System.out.println("[안내] 반갑습니다. 가맹주님!");
        System.out.println("[안내] 음식점 상호는 무엇인가요?");
        System.out.print(">>> ");
        String storeName = scanner.nextLine();
        System.out.println("[안내] 대표 메뉴 이름은 무엇인가요?");
        System.out.print(">>> ");
        String productName = scanner.nextLine();
        System.out.println("[안내] 해당 메뉴 가격은 얼마인가요?");
        System.out.print(">>> ");
        int productPrice = Integer.parseInt(scanner.nextLine());

        newStores[stores.length] = new Store(storeName, productName, productPrice);
        stores = newStores;

        System.out.printf("[안내] %s에 음식(%s, %d) 추가되었습니다.%n", storeName, productName, productPrice);
        System.out.println("[시스템] 가게 등록이 정상 처리되었습니다.");
        System.out.println("");
    }

//    public void printStores() {
//        for (Store store : stores) {
//            System.out.println(store.getStoreName());
//            System.out.println(store.getProductPrice());
//            System.out.println(store.getProductPrice());
//        }
//    }
}
