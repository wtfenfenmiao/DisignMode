package componentIterator;
import java.util.Iterator;
import java.util.Stack;

import menuComponent.menu;
import menuComponent.menuComponent;
import menuComponent.menuItem;



public class componentIterator implements Iterator{
	Stack st;
	
	public componentIterator(Iterator iter)
	{
		st=new Stack();
		st.push(iter);
	}

	public boolean hasNext() {
		if(st.empty())
			return false;
		else
		{
			Iterator it=(Iterator)st.peek();
			if(!it.hasNext())
			{
				st.pop();
				return hasNext();
			}
			else
				return true;
		}
	}


	public Object next() {
		if(hasNext())
		{
			Iterator it=(Iterator)st.peek();
			menuComponent me=(menuComponent)it.next();
			//System.out.println("get "+me.getName());
			if(me instanceof menu)
			{
				//st.push(me.createIterator());   ʷʫ��bug������Ǹ���һ���ϡ�
				//���bug�������ġ��������push�Ļ���componentIterator������֣��������it.next��ʱ���ǵݹ���á�
				//���Ǳ����룬ֻ�ڰְֵ�it.next��һ�ؾ��У������Ϊ���stack��componentIterator,
				//ÿ�ζ��Ƕ����ȵ�����next��ջ��Ȼ��ͬһ��Ԫ�ذְֻ���ջ��������ը��
				//����취���ǣ����ﲻpush omponentIterator����pushһ��ArrayList��iterator����������next�Ͳ�����ֵݹ����û����������
				st.push(me.returnList().iterator());   
			}
			return me;
		}
		else
			return null;
	}
	

	
}