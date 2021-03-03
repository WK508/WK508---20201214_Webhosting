﻿using _20210223.Control;
using _20210223.Model;
using _20210223.Util;
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
    // public partial class AddForm : MaterialForm
    partial class AddForm : MaterialForm
    {
        StudentCtrl sc;

        public AddForm()
        {
            InitializeComponent();
        }
        public AddForm(StudentCtrl sc)
        {
            InitializeComponent();
            this.sc = sc;
        }
       
        private void addOk_Click(object sender, EventArgs e)
        {
            if (addName.Text == "")
            {
                MessageBox.Show("이름을 입력하세요.");
            }

            if (addTel.Text == "")
            {
                MessageBox.Show("전화번호를 입력하세요.");
            }

            if (addAddress.Text == "")
            {
                MessageBox.Show("주소를 입력하세요.");
            }

            if (addEmail.Text == "")
            {
                MessageBox.Show("이메일을 입력하세요.");
            }

            Random r = new Random();
            StudentCtrl.getInst().getList().Add(
                new Student(StudentCtrl.getInst().getId(),
                addName.Text, addTel.Text, addAddress.Text, addEmail.Text));
            MessageBox.Show("정상적으로 데이터가 입력되었습니다.");
            Close();
        }

        private void addCancel_Click(object sender, EventArgs e)
        {
            Close();
        }
    }
}
