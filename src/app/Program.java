package app;

import app.store.StoreRepository;

import java.util.Scanner;

public class Program {
    Scanner scanner = new Scanner(System.in);
    public void start() {

        StoreRepository storeRepository = new StoreRepository();

        while (true) {
            printMenu();
            int selectedMenu = Integer.parseInt(scanner.nextLine());

            switch (selectedMenu) {
                case 1 :
                    storeRepository.addStore(scanner);
                    //storeRepository.printStores();
                    break;
                case 2 :
                    //음식점 별점 조회
                    break;
                case 3 :
                    order();
                    break;
                case 4 :
                    //별점 등록
                    break;
                case 5 :
                    System.out.println("[안내] 이용해주셔서 감사합니다.");
                    return;
                default :
                    System.out.println("[시스템] 잘못된 입력입니다.");
                    System.out.println("[시스템] 다시 확인해주세요.");
                    break;
            }

        }
    }

    public void printMenu() {
        System.out.println("[치킨의 민족 프로그램 V1]");
        System.out.println("-------------------------");
        System.out.println("1) [사장님 용] 음식점 등록하기");
        System.out.println("2) [고객님과 사장님 용] 음식점 별점 조회하기");
        System.out.println("3) [고객님 용] 음식 주문하기");
        System.out.println("4) [고객님 용] 별점 등록하기");
        System.out.println("5) 프로그램 종료하기");
        System.out.println("-------------------------");
        System.out.println("[시스템] 무엇을 도와드릴까요?");
        System.out.print(">>> ");
    }

    public void order() {
        System.out.println("[안내] 고객님! 메뉴 주문을 진행하겠습니다!");
        System.out.println("[안내] 주문자 이름을 알려주세요!");
        System.out.print(">>> ");

        String userName = scanner.nextLine();

        System.out.println("[안내] 주문할 음식점 상호는 무엇인가요?");
        System.out.print(">>> ");

        String store = scanner.nextLine();

        System.out.println("[안내] 주문할 메뉴 이름을 알려주세요!");
        System.out.print(">>> ");

        String product = scanner.nextLine();

        System.out.printf("[안내] %s님!%n", userName);
        System.out.printf("[안내] %s 매장에 %s 주문이 완료되었습니다.%n", store, product);
        System.out.println("");
    }
}
