package innerclass;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Quiz2 {

	public static void main(String[] args) {

		// 화면생성
		Frame frame = new Frame(); 
		frame.setLayout(new FlowLayout());
		frame.setBounds(500, 300, 500, 300);

		TextArea textArea = new TextArea("텍스트상자",10,50);
		frame.add(textArea);
		
		frame.setVisible(true);
		
		// 포커스 이벤트 등록하기!
		// 1. 구현클래스 만들어서 등록
		// 2. 익명클래스 만들어서 등록
		// 입력필드를 클릭하면 "포커스 되었습니다.."
		// 입력필드 밖을 클릭하면 "포커스가 벗어났습니다.." (프레임 밖을 찍기)
		textArea.addFocusListener(new FocusHandler());
		
//		textArea.addFocusListener(new FocusListener() {
//
//			@Override
//			public void focusGained(FocusEvent e) {
//				System.out.println("포커스 되었습니다~");
//				
//			}
//
//			@Override
//			public void focusLost(FocusEvent e) {
//				System.out.println("포커스를 벗어났습니다!!");
//				
//			}
//			
//		});
		
		
	}

}

class FocusHandler implements FocusListener {

	@Override
	public void focusGained(FocusEvent e) {
		
		System.out.println("포커스 되었습니다~");
		
	}

	@Override
	public void focusLost(FocusEvent e) {

		System.out.println("포커스를 벗어났습니다!!");
		
	}
	
}


