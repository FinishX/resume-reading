package com.resume.manager.controller;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName MyTestController
 * @Description
 * @Author yellow Machine
 * @Date2020/5/27 17:00
 * @Version V1.0
 **/
public class MyTestController {

    public static void main(String[] args) {
        
//        ListNode l1 = new ListNode(9);
//        l1.next=new ListNode(7);
//        l1.next.next=new ListNode(8);
//        l1.next.next.next=new ListNode(8);
//        l1.next.next.next.next=new ListNode(8);
//        l1.next.next.next.next.next=new ListNode(8);
//        l1.next.next.next.next.next.next=new ListNode(8);
//        l1.next.next.next.next.next.next.next=new ListNode(8);
//        l1.next.next.next.next.next.next.next.next=new ListNode(8);
//        l1.next.next.next.next.next.next.next.next.next=new ListNode(8);
//        l1.next.next.next.next.next.next.next.next.next.next=new ListNode(8);
//        l1.next.next.next.next.next.next.next.next.next.next.next=new ListNode(8);
//        l1.next.next.next.next.next.next.next.next.next.next.next.next=new ListNode(8);
//        l1.next.next.next.next.next.next.next.next.next.next.next.next.next=new ListNode(8);
//        ListNode l2 = new ListNode(6);
//        l2.next=new ListNode(8);
//        l2.next.next=new ListNode(5);
//        ListNode listNode = addTwoNumbers(l1,l2);
//        while(listNode!=null){
//            System.out.println(listNode.val);
//            listNode=listNode.next;
//        }
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> returnList = new ArrayList<>();
        int big=0;
        for(int i:candies){
            big = big<i?i:big;
        }
        for(int i:candies){
            if((i+extraCandies)>=big){
                returnList.add(true);
            }else {
                returnList.add(false);
            }
        }
        return returnList;
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1=l1;
        ListNode p2=l2;
        String v1="";
        String v2="";
        while(p1!=null||p2!=null){
            v1=v1+(p1==null?"0":p1.val+"");
            v2=v2+(p2==null?"0":p2.val+"");
            p1=p1==null?null:p1.next;
            p2=p2==null?null:p2.next;
        }
        StringBuffer sb1=new StringBuffer();
        sb1.append(v1);
        sb1.reverse();
        StringBuffer sb2=new StringBuffer();
        sb2.append(v2);
        sb2.reverse();
        String[] v1split = sb1.toString().split("");
        String[] v2split = sb2.toString().split("");
        int f=0;
        if(v1split.length>=v2split.length){
            f=1;
        }
        String vaddd = "";
        int fff =0;
        if(f==1){
            for(int p=0;p<v1split.length;p++){
                int va = Integer.valueOf(v1split[p])+(v2split[p]==null?0:Integer.valueOf(v2split[p]));
                if(va>=10){
                    fff = va%10;
                    vaddd=fff+vaddd;
                }else{
                    vaddd=va+vaddd;
                }
                fff=0;
            }
        }else {
            for(int p=0;p<v2split.length;p++){

            }
        }

        String value = (Integer.valueOf(v1)+Integer.valueOf(v2))+"";
        StringBuffer sb=new StringBuffer();
        sb.append(value);
//        sb.reverse();
        String[] ss = sb.toString().split("");
        return buildListNode(ss);
    }

    private static ListNode buildListNode(String[] input){
        ListNode first = null,last = null,newNode;
        int num;
        if(input.length>0){
            for(int i=0;i<input.length;i++){
                newNode=new ListNode(Integer.valueOf(input[i]));
                newNode.next=null;
                if(first==null){
                    last=newNode;
                    first=newNode;
                }
                else{
                    first.next=newNode;
                    first=newNode;
                }

            }
        }
        return last;
    }

    public static class ListNode {
        int val;
        ListNode next;
        public ListNode(int x){
            val=x;
        }
    }

    public int[] twoSum(int[] nums, int target) {
        boolean flag=false;
        int[] ssss=new int[2];
        for(int i=0;i<nums.length;i++){
            int d = nums[i];
            for(int j=i+1;j<nums.length;j++){
                if((d+nums[j])==target){
                    flag=true;
                    ssss[1]=j;
                    break;
                }
            }
            if(flag){
                ssss[0]=i;
                break;
            }
        }
        return ssss;
    }
}
