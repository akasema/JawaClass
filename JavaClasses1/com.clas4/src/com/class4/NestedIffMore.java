package com.class4;

public class NestedIffMore {
	public static void main(String[] args) {
		
		/*check age if age is less than 16 -->too young to drive
		 * othervise check  if you older than 18 --> you can get driver license 
		 * else --> you can get driver permit
		 * You can get driver license and if not you can get learner permit		 
		 */
		int age=19;
		
		if (age<16) {
			System.out.println("You Are to young to drive");
		}else {
			System.out.println("You are eligable to drive");
			
			if (age>=18) {
				System.out.println("You can drive alone");
			}else {
				System.out.println("You need your parents To drive");
			}
		}
		/*We need to check if student completed the quiz,
		 * if yes--> good job. if not --> not good
		 * if coompleted check score
		 * if more than 90--> you got an A
		 * if more than 80--> you got B
		 * anything else -- You should study more
		 */		 
		boolean quiz=true;
		int score=70;
		if (quiz) {
			System.out.println("Good Job ");
			if (score>=90) {
				System.out.println("You got an A score!!");
			}else if (score>80) {
				System.out.println("You Got a B!!");
			}else {
				System.out.println("You Should Study More");
			}
			
		}else {
			System.out.println("Not Good");
			
		}
		}
	}


