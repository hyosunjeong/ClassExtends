import com.biz.classex.children.BooKVO;

public class ClassExec02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BooKVO vo = new BooKVO();
		vo.setStrTitle("열혈자바");
		vo.setStrAuth("윤성우");
		vo.setStrComp("오렌지 미디어");
		
		System.out.println(vo);
		System.out.println(vo.toString());
		
	}

}
