import java.util.Scanner;

public class Challenge1 {
	public static void main(String[] args){

		//Challenge Part 1 (Take input from the user).


		//Check if name and surname are empty.
		Scanner sc = new Scanner(System.in);
		String name;
		while(true){
			System.out.print("What is your name: ");
			name = sc.nextLine();
			if(!name.isEmpty()&&(str = in.readLine()) != null){
				break;
			}
		}

		String surname;
		while(true){
			System.out.print("What is your surname: ");
			surname = sc.nextLine();
			if(!surname.isEmpty()){
				break;
			}
		}


		//Get a valid date of birth
		String date_of_birth;
		int age;
		while(true){
			System.out.print("Enter your date of birth(DD/MM/YYYY): ");
			date_of_birth = sc.nextLine();
			if(date_of_birth.length() == 10 && date_of_birth.charAt(2) == '/' && date_of_birth.charAt(5) == '/'){    // check if date format is correct
				try{
					int month = Integer.parseInt(date_of_birth.split("/")[1]);
					if(month > 0 && month < 13){
						try{
							int day = Integer.parseInt(date_of_birth.split("/")[0]);
							if(day > 0 && day < 31){
								int yearCheck = Integer.parseInt(date_of_birth.split("/")[2]);
								if(yearCheck < 2020){
									age = 2021 - yearCheck;
									break;
								}else if(month == 04 || month == 06 ||month == 10||month > 0 && day < 30){
                                    int yearCheck = Integer.parseInt(date_of_birth.split("/")[2]);
                                    if(yearCheck < 2021) age = 2021 - yearCheck;
                                    else {
                                        System.out.println("Year not valid!");
                                    }else{
									System.out.println("Year not valid!");
								}
							}else{
								System.out.println("Day not valid!");
							}
						}catch(Exception e){
							System.out.println("Day not valid!");
						}
					}else{
						System.out.println("Month not valid!");
					}
				}
				catch(Exception e){
					System.out.println("Month not valid!");
				}
			}
		}


		//Get a valid user distance
		Double distance_from_store;
		while(true){
			try{
				System.out.print("How far is your favourite store from your home? ");
				distance_from_store = sc.nextDouble();
				if(distance_from_store > 0){			//Distance cannot be negative
					break;
				}
					System.out.println("Distance not valid!");
			}catch(Exception e){
				System.out.println("Distance not valid!");
				sc.next(); 				//flush user input in the keyboard scanner.
			}

		}

		System.out.println();

		//Challenge Part 2
		System.out.println("Hello " + name + " " + surname);
		System.out.println("You are " + age + " years old");

		System.out.println();

		//Challenge Part 3
		Double miles = distance_from_store*0.621371;  		// convert kilometers to miles
		System.out.println("Your favourite store is " + miles + " miles away");
		Double meters = distance_from_store*1000;  			// convert kilometers to meters
		System.out.println("Your favourite store is " + meters + " meters away");

		System.out.println();

		long age_in_seconds = age*365*86400;				// convert years to seconds
		System.out.println("You are " + age_in_seconds + " seconds old");
		double age_in_milliseconds = age_in_seconds*1000;		// convert seconds to milliseconds
		System.out.println("You are " + age_in_milliseconds + " milliseconds old");
		System.out.println("Your age is "+ Integer.toHexString(age)+ " in hexadecimal");
		System.out.println("Your age is "+ Integer.toOctalString(age)+ " in octadecimal");
		System.out.println("Your age is "+ Integer.toBinaryString(age)+ " in binary");
		System.out.println();

	}
}
