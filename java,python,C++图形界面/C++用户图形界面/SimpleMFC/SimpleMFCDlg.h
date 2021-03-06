
// SimpleMFCDlg.h: 头文件
//

#pragma once


// CSimpleMFCDlg 对话框
class CSimpleMFCDlg : public CDialogEx
{
// 构造
public:
	CSimpleMFCDlg(CWnd* pParent = nullptr);	// 标准构造函数

// 对话框数据
#ifdef AFX_DESIGN_TIME
	enum { IDD = IDD_SIMPLEMFC_DIALOG };
#endif

	protected:
	virtual void DoDataExchange(CDataExchange* pDX);	// DDX/DDV 支持


// 实现
protected:
	HICON m_hIcon;

	// 生成的消息映射函数
	virtual BOOL OnInitDialog();
	afx_msg void OnSysCommand(UINT nID, LPARAM lParam);
	afx_msg void OnPaint();
	afx_msg HCURSOR OnQueryDragIcon();
	DECLARE_MESSAGE_MAP()
public:
	afx_msg void OnRawInput(UINT nInputcode, HRAWINPUT hRawInput);

//	CString user;
//	CString password;
	afx_msg void OnClickedLogin();
	afx_msg void OnClickedReset();
	CString password;
	CString user;
	afx_msg void OnStnClickeduserlabel();
};
