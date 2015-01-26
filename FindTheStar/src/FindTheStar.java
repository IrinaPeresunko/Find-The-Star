
//Given a group of N people. Everyone in the group has a unique number from 1 to N.
//Some members of this group know each other, some are not.
//In this group, there is one and only one special person (let's call it "Star"),
//which differs from the others in the group so that everyone knows it, but he does not know anyone.
//find a star not brute force, and optimal way.

public class FindTheStar {

	public static void main(String[] args) {
		int mas[][]={
				{1,2,3,4,5,6,7,8,9,11,12,13,18,19,20,22,23,24,25,26,27,28,29,30},
				{10,11,12,13,14,26,27,28,29,30},
				{1,4,5,11,17},
				{5,11,27,28,29,30},
				{1,2,3,4,5,6,7,8,9,10,11},
				{1,2,3,4,5,6,7,8,9,11,12,13,18,19,20,22,23,24,25,26,27,28,29,30},
				{1,6,7,8,11,15,16,17,25,26,27,28},
				{1,2,9,10,11,12,13,14,15,16,17,21,22,23,24,25,26,27,28,29,30},
				{8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30},
				{11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30},
				{1,2,3,4,5,6,7,8,9,10,11,28,29,30},
				{},
				{7,8,9,10,11,12,13,14,18,19,20,21,22,23,24,25,26},
				{9,10,11,23,24,25,26,27,28,29,30},
				{3,4,5,6,7,8,9,10,11},
				{1,2,3,4,5,6,7,8,9,10,11},
				{11},
				{11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30},
				{1,6,7,8,9,10,11,19,20,21,22,23,24,25,26,27,28,29,30},
				{9,10,11,24,25,26,27,28,29,30},
				{11,12,13,14,15,16,17,18,19,20},
				{8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27},
				{1,2,3,4,5,6,7,8,9,10,11,29,30},
				{1,2,11,22,23,24,25,26},
				{11,12,13,14,15,16,17},
				{1,2,3,11,12,13,14},
				{6,7,8,9,10,11,16,17,18,19,20,24,25,26,27,28,29,30},
				{3,4,5,11,12,13},
				{10,11,12,13,22,23,24,25,26,27,28,29},
				{6,7,8,9,10,11,12,13},
				{1,2,3,4,5,6,7,11,17,18,27,28,29}
		};
		int N=mas.length;
		int[] tempStar = mas[0];
		//System.out.println(Arrays.toString(tempStar));
		
		int star=-1;
		
		for(int i=1,count=0;i<N;i++,count=0){
		boolean flag=true;
			for(int j=0,k=0;j<tempStar.length;j++,k=0){
				
				if(mas[i].length==0){
					star=i;
					break;
					}
				
				if(tempStar[j]==mas[i][k]) continue;
				else{
					while(k<mas[i].length){
						if(tempStar[j]!=mas[i][k] && k<mas[i].length ){
							flag=false;
							k++;
							continue;
							}
						else {
							flag=true;break;
							}
				}
					if(flag==false) tempStar[j]=-1;
				}
			}
			for(int j=0;j<tempStar.length;j++){
				if(tempStar[j]!=-1){
					count++;
					star=tempStar[j];
				}
			}
			if(count==1) break;
		}
		//System.out.println(Arrays.toString(tempStar));
		System.out.println("Star is a user whose number is "+star);
	}

}
