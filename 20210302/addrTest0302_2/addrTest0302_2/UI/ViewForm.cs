using _20210223.Control;
using _20210223.Model;
using MaterialSkin.Controls;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace addrTest0302_2.UI
{
    partial class ViewForm : MaterialForm
    {
        StudentCtrl sc;
        public ViewForm(StudentCtrl sc)
        {
            InitializeComponent();
            this.sc = sc;
        }



        private void initListView()
        {
            string[] data = { "1", "시벨롬", "010-1111-1111",
                              "대한민국 어딘가", "homme@naver.com" };
            listView.Items.Add(new ListViewItem(data));

            for (int i = 0; i < 10; i++)
            {
                listView.Items.Add(new ListViewItem(
                    new string[]
                    {
                        (i+2).ToString(), "시벨롬", "010-1111-1111",
                        "모르겄다", "homme@naver.com"
                    }
                    ));
            }
            setRowColor(listView, Color.DarkGray, Color.Green);
            int index = listView.Items.Count - 1;
            // listView.Items[index].Selected = true;
            listView.Items[index].Focused = true;
            listView.EnsureVisible(index);
        }

        private void showList()
        {
            int cnt = sc.getList().Count;
            for (int i = 0; i < cnt; i++)
            {
                List<Student> addrList = sc.getList();
                listView.Items.Add(new ListViewItem(
                    new string[]
                    {
                            (i + 1).ToString(),
                            addrList[i].Name,
                            addrList[i].Tel,
                            addrList[i].Address,
                            addrList[i].Email
                    }
              ));
            }
        }

        private void setRowColor(ListView list, Color color1, Color color2)
        {
            foreach (ListViewItem item in list.Items)
            {
                if ((item.Index % 2) == 0)
                {
                    item.BackColor = color1;
                }
                else
                {
                    item.BackColor = color2;
                }
            }
        }

        private void ViewForm_Load(object sender, EventArgs e)
        {
            initListView();
            initGridView();
        }

        private void initGridView()

        {
            string[] data = { "1", "시벨롬", "010-1111-1111",
                              "대한민국 어딘가", "homme@naver.com" };
            GridView.Rows.Add(data);

            for (int i = 0; i < 10; i++)
            {
                GridView.Rows.Add(new string[]
                    {
                        (i+2).ToString(), "시벨롬", "010-1111-1111",
                        "대한민국 어딘가", "homme@naver.com"
                    }
                    );
            }

            int count = GridView.Rows.Count - 1;
            GridView.FirstDisplayedScrollingRowIndex =
                count;
            GridView.CurrentCell =
                GridView.Rows[count - 1].Cells[0];
        }

        private void showGridView()

        {
            int cnt = sc.getList().Count;
            for (int i = 0; i < cnt; i++)
            {
                List<Student> addrList = sc.getList();
                GridView.Rows.Add(new string[]
                {
                        (i + 1).ToString(),
                        addrList[i].Name,
                        addrList[i].Tel,
                        addrList[i].Address,
                        addrList[i].Email
                }
               );
            }
        }

        private void listView_SelectedIndexChanged(object sender, EventArgs e)
        {
            if (listView.SelectedItems.Count != 0)
            {
                int n = listView.SelectedItems[0].Index;
                string name = listView.Items[n].SubItems[1].Text;
                string tel = listView.Items[n].SubItems[2].Text;
                string address = listView.Items[n].SubItems[3].Text;
                string email = listView.Items[n].SubItems[4].Text;
                Console.WriteLine("이름 : {0}", name);
                Console.WriteLine("전화 : {0}", tel);
                Console.WriteLine("주소 : {0}", address);
                Console.WriteLine("메일 : {0}", email);
                Console.WriteLine("-------------------------------------");
                listView.Items.RemoveAt(n);
            }
        }

        private void viewExit_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }
    }
}
