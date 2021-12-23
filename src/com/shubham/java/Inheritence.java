package com.shubham.java;

class Book11 {
static String bookName;static String authorName;String publication;int edition;int publicationYear;int bookprice;int totalPages;
void bookInfo(String publication,int edition,int publicationYear,int bookprice,int totalPages)
{
	 this.publication=publication;
	 this.edition=edition;
	 this.publicationYear=publicationYear;
	 this.bookprice=bookprice;
	 this.totalPages=totalPages;
}
void display()
{
System.out.println("********Base Class Book11***********"); 
System.out.println("Book Name is="+bookName);
System.out.println("Author Name is="+authorName);
System.out.println("Publication Name is="+publication);
System.out.println("Publication Year is="+publicationYear);
System.out.println("Book Price is="+bookprice);
System.out.println("total book Pages are="+totalPages);
System.out.println("*************************");
}
}
class SubjectInfo extends Book11{
	 
	 static String subjectName;static int totalPagesOccupied;int totalChapterNo;String summaryOfSubject;
	 void subject(int chapterNo,String summaryOfSubject)
	 {  
		super.bookInfo("S.Chand publication",3,2021,560,1250);
		super.display();
		this.totalChapterNo=totalPagesOccupied; 
		this.totalChapterNo= chapterNo;
		this.summaryOfSubject=summaryOfSubject;
	 }
	 void Display()
	 {
		 System.out.println("*********Derived Class SubjectInfo*********"); 
		 System.out.println("Subject Name is ="+subjectName); 
		 System.out.println("Total Pages Ocuupied by this subject in the book="+totalPagesOccupied); 
		 System.out.println("Total no of Chapters in this book is ="+totalChapterNo); 
		 System.out.println("Summary of this Subject is ="+summaryOfSubject); 
		 System.out.println("*******************");
	 }
}
class TheoryOfMachine extends SubjectInfo{
	 
	 static String chaptertName;int chapterindexNo;static int totalPagesOccupied;int ChapterMarks;String chapterSummary;
	 void VelocityAndAccelerationAnalysis(int indexNo,int Marks,String summary)
	 {  
		super.subject(3,"Theory of machine gives basic idea about machines and its structure");
		super.Display();
		this.chapterindexNo=indexNo; 
		this.ChapterMarks= Marks;
		this.chapterSummary=summary;
	 }
	 void Display1()
	 {
		 System.out.println("*********Derived Class TheoryOfMachine ***********");
		 System.out.println("Chapter Name is ="+chaptertName);
		 System.out.println("Total Pages Occupied in the Subject are ="+totalPagesOccupied);
		 System.out.println("Chapter number in Book Index is ="+chapterindexNo); 
		 System.out.println("university Exam carrying Marks are ="+ChapterMarks); 
		 System.out.println("Chapter Summary is ="+chapterSummary); 
		 System.out.println("*******************");
	 }
}
public class Inheritence{
	 
	 
	public static void main(String[] args) {
		Book11.bookName=("A Texbook of Conventional and objective of Mechanical Engineering");
		Book11.authorName=("R.S.Khurmi");
		Book11 b=new Book11();
		b.bookInfo("S.Chand publication",3,2021,560,1250);
		b.display();
		SubjectInfo s=new SubjectInfo();
		s.subject(3,"Theory of machine gives basic idea about machines and its structure");
		SubjectInfo.subjectName=("Theory of Machine");
		SubjectInfo.totalPagesOccupied=(121);
		s.Display();
		TheoryOfMachine th=new TheoryOfMachine();
		th.VelocityAndAccelerationAnalysis(3, 18,"This chapter enable student to do static and dyanmic analysis of machine links");
		TheoryOfMachine.chaptertName=("Velocity and Acceleration of Machine Links");
		TheoryOfMachine.totalPagesOccupied=(52);
		th.Display1();
		
	}

}