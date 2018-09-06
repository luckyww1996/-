package com.ssm.yunshang.pojo;

import java.util.List;

public class Page<T> {
	
	private Integer allPageNum;			//������
	private Integer pageRowNum;			//ÿҳ����
	private Integer currentPage;		//��ǰҳ��
	private List<T> objList;		//��ǰҳ��ʾ����Ϣ
	
	public Integer getAllPageNum() {
		return allPageNum;
	}
	
	public void setAllPageNum(Integer allPageNum) {
		this.allPageNum = allPageNum;
	}
	
	public Integer getPageRowNum() {
		return pageRowNum;
	}
	
	public void setPageRowNum(Integer pageRowNum) {
		this.pageRowNum = pageRowNum;
	}
	
	public Integer getCurrentPage() {
		return currentPage;
	}
	
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	
	public List<T> getObjList() {
		return objList;
	}
	
	public void setObjList(List<T> objList) {
		this.objList = objList;
	}
	
	@Override
	public String toString() {
		return "Page [allPageNum=" + allPageNum + ", pageRowNum=" + pageRowNum + ", currentPage=" + currentPage
				+ ", objList=" + objList + "]";
	}
	
}
