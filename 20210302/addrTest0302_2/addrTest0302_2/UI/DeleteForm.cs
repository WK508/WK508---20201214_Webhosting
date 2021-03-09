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
    partial class DeleteForm : MaterialForm
    {
        StudentCtrl sc;
        public DeleteForm()
        {
            InitializeComponent();
        }

        public DeleteForm(StudentCtrl sc)
        {
            InitializeComponent();
            this.sc = sc;
        }



        private void showList()
        {
            int cnt = sc.getList().Count();
            for (int i = 0; i < cnt; i++)
            {
                List<Student> addrList = sc.getList();
                DelList.Items.Add(new ListViewItem(
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

            setRowColor(DelList, Color.DarkGray, Color.Green);
            int index = DelList.Items.Count - 1;
            // listView.Items[index].Selected = true;
            DelList.Items[index].Focused = true;
            DelList.EnsureVisible(index);
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

        private void DeleteForm_Load(object sender, EventArgs e)
        {
            showList();
        }

        

        private void DelList_SelectedIndexChanged(object sender, EventArgs e)
        {
            if (DelList.SelectedItems.Count != 0)
            {
                int n = DelList.SelectedItems[0].Index;
                string name = DelList.Items[n].SubItems[1].Text;
                string tel = DelList.Items[n].SubItems[2].Text;
                string address = DelList.Items[n].SubItems[3].Text;
                string email = DelList.Items[n].SubItems[4].Text;
                Console.WriteLine("이름 : {0}", name);
                Console.WriteLine("전화 : {0}", tel);
                Console.WriteLine("주소 : {0}", address);
                Console.WriteLine("메일 : {0}", email);
                Console.WriteLine("-------------------------------------");
                DelList.Items.RemoveAt(n);
                DelName.Text = name;
                DelTel.Text = tel;
                DelAddress.Text = address;
                DelEmail.Text = email;
            }
        }
    }
}
