package gui;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import board.Board;
import etc.Book;
import etc.Deal;
import user.Member;
import user.User;

public class MySellingListPanel extends JPanel {

	public JTable table;
	/**
	 * Create the panel.
	 */
	public MySellingListPanel(ArrayList<User> userList, ArrayList<Board> boardList, ArrayList<Book> bookList, ArrayList<Deal> dealList, JPanel cardLayoutPanel) {
		this.setBounds(14, 60, 1246, 613);
		setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("판매중인 상품");
		lblNewLabel_5.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_5.setBounds(35, 20, 250, 30);
		add(lblNewLabel_5);
		
		Member member = new Member();
		
		// ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★  테이블 시작  ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★ //
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(14, 63, 729, 511);
		add(scrollPane);
		table = new JTable();
		table.setEnabled(false);
//		member.showSaleBoardListByGUI(userList, boardList,bookList, table);
		member.showMySellingListGUI(userList, boardList,table);
		scrollPane.setViewportView(table);
		// ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★  테이블 종료  ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★ //
	} // 위시리스트 패널 생성자

}
