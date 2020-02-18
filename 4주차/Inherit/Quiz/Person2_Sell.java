public class Person2 {
	private String name;
	private int money;
	private int cnt;
	private int sum;
	private Product[] prod = new Product[3];
		public Person2(String name, int money) {
			setName(name);
			setMoney(money);
		}
		public void buy(Product prod) {
			if(money>=prod.getPrice()) {
				money-=prod.getPrice();
				System.out.println(name+"님이 " + prod.getPrice() + "을 지불하고" + prod.getModel()
						+ "을 구매함");
				System.out.println("[잔액] : " + getMoney());
				this.prod[cnt];
			}else{
				System.out.println("잔액이 부족합니다.");
			}
		}//buy_end
		public void sell(Product[] prod) {
			
		}
	public String getName() {
		return name;
		}
	public void setName(String name) {
		this.name = name;
		}
	public int getMoney() {
		return money;
		}
	public void setMoney(int money) {
		this.money = money;
		}


	public Product[] getProd() {
		return prod;
	}

	public void setProd(Product[] prod) {
		this.prod = prod;
	}
	}
//- name : String
//- money : int
//- prod : Product
//---------------
//<<constructor>>
//+ Person(String, int)
//  -> name, money
//
//<<method>>
//+ buy(Product) : void
////전달인자로 받은 Product를
////멤버필드에 저장하고
////물건가격만큼 money를 차감한다
////아래 ex) 내용처럼 출력한다 
//ex)
//Alice님이 500원을 지불하고 i5 구매함
//[잔액] 0원
//
//<<getter>>
//+ getName() : String
//+ getMoney() : int
//<<setter>>
//+ setName(String) : void
//+ setMoney(int) : void
//---------------
