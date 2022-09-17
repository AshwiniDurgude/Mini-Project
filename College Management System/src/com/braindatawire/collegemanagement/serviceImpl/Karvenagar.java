package com.braindatawire.collegemanagement.serviceImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.braindatawire.collegemanagement.model.Batch;
import com.braindatawire.collegemanagement.model.Course;
import com.braindatawire.collegemanagement.model.Faculty;
import com.braindatawire.collegemanagement.model.Student;
import com.braindatawire.collegemanagement.service.Cjc;

public class Karvenagar implements Cjc 
{
	List<Course> clist=new ArrayList<>();
	List<Faculty> flist=new ArrayList<>();
	List<Batch> blist=new ArrayList<>();
	List<Student> slist=new ArrayList<>();
	
	Scanner sc=new Scanner(System.in);
	//Course c=new Course();
	//Faculty f=new Faculty();
	//Batch b=new Batch();
	//Student s=new Student();
	
	public void addCourse()
	{
		Course c=new Course();
		System.out.println("Enter Course Id:");
		int cid=sc.nextInt();
		c.setCid(cid);
		
		System.out.println("Enter Course Name:");
		String cname=sc.next();
		c.setCname(cname);
		clist.add(c);
	}
	public void viewCourse()
	{
		//get course data using iterartor here
		Iterator itr=clist.iterator();
		while(itr.hasNext())
		{
			Course c=(Course) itr.next();
			System.out.println(c.getCid());
			System.out.println(c.getCname());
		}
	}
	public void addFaculty()
	{
		Faculty f=new Faculty();
		System.out.println("Enter course ID");
		int fcid=sc.nextInt();
		Iterator<Course> itr = clist.iterator();
		while(itr.hasNext())
		{
				Course cc = itr.next();
						int lcid = cc.getCid();
						if(fcid==lcid)
						{
							System.out.println("Enter Faculty ID:");
							int fid=sc.nextInt();
							f.setFid(fid);
							System.out.println("Enter Faculty Name:");
							String fname=sc.next();
							f.setFname(fname);
							System.out.println("Enter Faculty Course:");
							String fcoursre=sc.next();
							f.setCourse(cc);
							flist.add(f);
						}
		}
	
	}
	public void viewFaculty()
	{
		//System.out.println(flist);
		//get faculty data using iterartor here
		Iterator itr=flist.iterator();
		while(itr.hasNext())
		{
			Faculty f=(Faculty) itr.next();
			System.out.println(f.getFid());
			System.out.println(f.getFname());
			System.out.println(f.getCourse().getCid());
			System.out.println(f.getCourse().getCname());
		}
	}

	public void addBatch()
	{
		//set batch data using scanner here and add into list here
		Batch b=new Batch();
		System.out.println("Enter Faculty ID:");
		int bfid=sc.nextInt();
		Iterator<Faculty> itr1 = flist.iterator();
		while(itr1.hasNext())
		{
			Faculty ff=itr1.next();
			int lfid=ff.getFid();
			if(bfid==lfid)
			{
				System.out.println("Enter Batch ID:");
				int bid= sc.nextInt();
				b.setBid(bid);
				System.out.println("Enter Batch Name:");
				String bname=sc.next();
				b.setBname(bname);
				System.out.println("Enter Batch Faculty:");
				String bfaculty=sc.next();
				b.setFaculty(ff);
				blist.add(b);
			}
		}

	}
	public void viewBatch()
	{
		//get batch data using iterator here
		Iterator itr2=blist.iterator();
		while(itr2.hasNext())
		{
			Batch b=(Batch) itr2.next();
			System.out.println(b.getBid());
			System.out.println(b.getBname());
			//System.out.println(b.getFaculty());
			System.out.println(b.getFaculty().getFid());
			System.out.println(b.getFaculty().getFname());
		}
		
	}
	
	public void addStudent()
	{
		//set student data using scanner here and add into list here
		Student s=new Student();
		System.out.println("Enter Batch ID:");
		int sbid=sc.nextInt();
		Iterator<Batch> itr = blist.iterator();
		while(itr.hasNext())
		{
			Batch bb=itr.next();
			int lbid= bb.getBid();
			if(sbid==lbid)
			{
				System.out.println("Enter Student ID:");
				int sid=sc.nextInt();
				s.setSid(sid);
				System.out.println("Enter Student Name:");
				String sname=sc.next();
				s.setSname(sname);
				System.out.println("Enter Student Batch:");
				int sbatch=sc.nextInt();
				s.setBatch(bb);
				slist.add(s);
			}
		}
	}
	public void viewStudent()
	{
		//get student data using iterartor here
		Iterator itr3=slist.iterator();
		while(itr3.hasNext())
		{
			Student s=(Student) itr3.next();
			System.out.println(s.getSid());
			System.out.println(s.getSname());
			//System.out.println(s.getBatch());
			System.out.println(s.getBatch().getBid());
			System.out.println(s.getBatch().getBname());
		}
	}

}
