package com.management.utils;

import java.util.List;

import com.management.pojo.Order;

/**
 * ҳ����Ϣ������
 */
public class PageUtil {
	
	public int page; //��ǰҳ��
	public int max; //ÿҳ��ʾ��¼��
	public int total; //��ҳ��
	public int begin; //ÿҳ��ʼԪ����list������
	public int end; //ÿҳ����Ԫ����list������
	public int size; //�ܼ�¼��
	public int[] navigatepageNums; //��Чҳ������
	public List<Order> list; //ѧ���б�
	
	public PageUtil(List<Order> list, int page, int max) {
		this.list = list;		
		this.max = max;
		this.total = list.size() % max == 0?
				list.size() / max : list.size() / max + 1;
		this.size = list.size();
		this.begin = (page - 1) * max;
		this.page = judgePage(page);
		this.end = (page - 1) * max + 4;
		this.navigatepageNums = new int[total];
		for(int i = 1; i <= total; i++) {
			navigatepageNums[i-1] = i;
		}
	}
	/**
	 * ��ҳ��С��1ʱ����Ϊ1����ҳ��������ҳ��ʱ����Ϊ���ҳ��
	 * @param page ҳ��
	 */
	public int judgePage(int page) {
		if(page > total) {
			return total;
		}
		if(page < 1) {
			return 1;
		}
		return page;
	}
	/**
	 * �Ƿ���ǰһҳ
	 */
	public boolean hasPrevious() {
		if(page  > 1) {
			return true;
		}
		return false;
	}
	/**
	 * �Ƿ��к�һҳ
	 */
	public boolean hasNext() {
		if(page < total) {
			return true;
		}
		return false;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getBegin() {
		return begin;
	}

	public void setBegin(int begin) {
		this.begin = begin;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public int[] getNavigatepageNums() {
		return navigatepageNums;
	}

	public void setNavigatepageNums(int[] navigatepageNums) {
		this.navigatepageNums = navigatepageNums;
	}

	public List<Order> getList() {
		return list;
	}

	public void setList(List<Order> list) {
		this.list = list;
	}
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	
}
