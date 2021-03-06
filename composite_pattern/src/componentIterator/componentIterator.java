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
				//st.push(me.createIterator());   史诗级bug，真的是改了一晚上。
				//这个bug是这样的。如果这里push的还是componentIterator，会出现，上面调用it.next的时候是递归调用。
				//我们本来想，只在爸爸的it.next调一回就行，结果因为这个stack和componentIterator,
				//每次都是儿子先调用完next入栈，然后同一个元素爸爸还入栈，就这样炸了
				//解决办法就是，这里不push omponentIterator，就push一个ArrayList的iterator，这样再用next就不会出现递归调用没个完的情况了
				st.push(me.returnList().iterator());   
			}
			return me;
		}
		else
			return null;
	}
	

	
}