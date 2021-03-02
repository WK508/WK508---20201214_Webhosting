﻿using _20210223.Control;
using _20210223.View;
using addrTest0302_2.UI;
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

namespace addrTest0302_2
{
    public partial class MainForm : MaterialForm
    {
        MyMenu menu = new MyMenu();
        StudentCtrl sc = new StudentCtrl();
        public MainForm()
        {
            InitializeComponent();
           
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void addrExit_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }

        private void addrHelp_Click(object sender, EventArgs e)
        {
            MessageBox.Show("Update 2021년 3월 2일 by wk, 늦었다고 생각할 때가 진짜 늦은 거다!!!");
        }

        private void addrAdd_Click(object sender, EventArgs e)
        {
            // sc.addItem();
            new AddForm(sc).ShowDialog();
        }

        private void addrView_Click(object sender, EventArgs e)
        {
            sc.viewItem();
        }

        private void addrAddRand_Click(object sender, EventArgs e)
        {
            sc.randData(3);
        }

        private void addrDel_Click(object sender, EventArgs e)
        {
            sc.delItem();
        }

        private void addrDelAll_Click(object sender, EventArgs e)
        {
            sc.delItemAll();
        }

        private void addrUpdate_Click(object sender, EventArgs e)
        {

        }
    }
}
