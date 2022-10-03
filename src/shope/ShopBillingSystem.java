package shope;

import java.util.Scanner;

public class ShopBillingSystem {
	public static double eBill,bBill,kBill,cBill,oBill;
	public static int mbudget;
	public static void electronics()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("you selected Eclectronics: ");
		System.out.println("List of items Available in Electronics : ");
		System.out.println("1.Television \n 2. WashingMachine \n 3. MicroOven \n 4. Mobiles ");
		int ch = sc.nextInt();
		if (ch==1)
		{
			double tvCost = 25000;
			System.out.println("The cost of Television :"+tvCost);
			eBill += tvCost;
		}
		else if (ch==2)
		{
			double wmCost = 15000;
			System.out.println("The cost of Washing Machine :"+wmCost);
			eBill += wmCost;
		}
		else if (ch==3)
		{
			double moCost = 3000;
			System.out.println("The cost of MicroOven :"+moCost);
			eBill += moCost;
		}
		else if(ch==4)
		{
			double mCost = 12000;
			System.out.println("The cost of Mobile :"+mCost);
			eBill += mCost;
		}
		if (mbudget >= eBill)
		{
			shopItem();
		}
		else
			electronics();
	}
	public static void bath()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("you selected Bath: ");
		System.out.println("List of items Available in Bath : ");
		System.out.println("1.Bucket & Mug \n 2. Soaps \n 3. Shampoo \n 4. Conditioner ");
		int ch = sc.nextInt();
		if (ch==1)
		{
			double bCost = 300;
			System.out.println("The cost of Bucket & Mug :"+bCost);
			bBill += bCost;
		}
		else if (ch==2)
		{
			double sCost = 150;
			System.out.println("The cost of Soaps :"+sCost);
			bBill += sCost;
		}
		else if (ch==3)
		{
			double shCost = 200;
			System.out.println("The cost of Shampoo :"+shCost);
			bBill += shCost;
		}
		else if(ch==4)
		{
			double cCost = 250;
			System.out.println("The cost of Conditioner :"+cCost);
			bBill += cCost;
		}
		if (mbudget >= bBill)
		{
			shopItem();
		}
		else
			bath();
	}
	public static void kitchen()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("you selected Kitech: ");
		System.out.println("List of items Available in Kitchen : ");
		System.out.println("1.Groceries \n 2. Stove \n 3. Mixer \n 4. Juicer ");
		int ch = sc.nextInt();
		if (ch==1)
		{
			double gCost = 3000;
			System.out.println("The cost of Groceries :"+gCost);
			kBill += gCost;
		}
		else if (ch==2)
		{
			double sCost = 2500;
			System.out.println("The cost of stove :"+sCost);
			kBill += sCost;
		}
		else if (ch==3)
		{
			double moCost = 3000;
			System.out.println("The cost of Mixer :"+moCost);
			kBill += moCost;
		}
		else if(ch==4)
		{
			double jCost = 1500;
			System.out.println("The cost of Juicer :"+jCost);
			kBill += jCost;
		}
		if (mbudget >= kBill)
		{
			shopItem();
		}
		else
			kitchen();
	}
	public static void cloths()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("you selected Cloths: ");
		System.out.println("List of items Available in Cloths : ");
		System.out.println("1.Men \n 2. Women \n 3. Kids \n 4. Babies ");
		int ch = sc.nextInt();
		if (ch==1)
		{
			double mCost = 2500;
			System.out.println("The cost of Men's :"+mCost);
			cBill += mCost;
		}
		else if (ch==2)
		{
			double wmCost = 3000;
			System.out.println("The cost of Women :"+wmCost);
			cBill += wmCost;
		}
		else if (ch==3)
		{
			double kCost = 2500;
			System.out.println("The cost of MicroOven :"+kCost);
			cBill += kCost;
		}
		else if(ch==4)
		{
			double bCost = 2000;
			System.out.println("The cost of Babies :"+bCost);
			cBill += bCost;
		}
		if (mbudget >= cBill)
		{
			shopItem();
		}
		else
			cloths();
	}
	public static void others()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("you selected Others: ");
		System.out.println("List of items Available in Others : ");
		System.out.println("1.Stationary \n 2. Games \n 3. Snacks ");
		int ch = sc.nextInt();
		if (ch==1)
		{
			double sCost = 250;
			System.out.println("The cost of Stationary :"+sCost);
			oBill += sCost;
		}
		else if (ch==2)
		{
			double gCost = 1000;
			System.out.println("The cost of Games :"+gCost);
			oBill += gCost;
		}
		else if (ch==3)
		{
			double saCost = 500;
			System.out.println("The cost of Snacks :"+saCost);
			oBill += saCost;
		}
		if (mbudget >= oBill)
		{
			shopItem();
		}
		else
			others();
	}
	public static void shopItem()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Shopping Mart!!");
		System.out.println("List of sections available in this mart:");
		System.out.println(" 1.Electronics\n 2.Bath\n 3.Kitchen\n 4.Cloths\n 5.Others \n 6.Bill");
		int opt = sc.nextInt();
		switch(opt)
		{
		case 1:
		{
			electronics();
			System.out.println("Do you want to continue in electrinics press 1 else press 2");
			int op = sc.nextInt();
			if (op == 1)
			{
				electronics();
			}
			else
			{
				shopItem();
			}
			break;
		}
		case 2:
		{
			bath();
			System.out.println("Do you want to continue in electrinics press 1 else press 2");
			int op = sc.nextInt();
			if (op == 1)
			{
				bath();
			}
			else
			{
				shopItem();
			}
			break;
		}
		case 3:
		{
			kitchen();
			System.out.println("Do you want to continue in electrinics press 1 else press 2");
			int op = sc.nextInt();
			if (op == 1)
			{
				kitchen();
			}
			else
			{
				shopItem();
			}
			break;
		}
		case 4:
		{
			cloths();
			System.out.println("Do you want to continue in electrinics press 1 else press 2");
			int op = sc.nextInt();
			if (op == 1)
			{
				cloths();
			}
			else
			{
				shopItem();
			}
			break;
		}
		case 5:
		{
			others();
			System.out.println("Do you want to continue in electrinics press 1 else press 2");
			int op = sc.nextInt();
			if (op == 1)
			{
				others();
			}
			else
			{
				shopItem();
			}
			break;
		}
		case 6:
		{
			double bill = eBill+bBill+kBill+cBill+oBill;
			System.out.println("Total bill is :"+bill);
			break;
		}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the minimum budget:");
		mbudget = sc.nextInt();
		shopItem();
	}
}
